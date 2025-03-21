package concurrencia.tema.tres;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class PanelJuego extends Canvas implements Runnable {
    Snake s;
    int avx,avy;
    boolean izq,der,arr,aba;
    boolean jugando;
    Comida comida;
    PanelJuego(){
        der=true;
        s= new Snake(avx, avy, 1, 0);
        jugando=true;
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_A) {
                    avx=-1;
                    avy=0;
                }
                if(e.getKeyCode()==KeyEvent.VK_W) {
                    avx=0;
                    avy=-1;
                }
                if(e.getKeyCode()==KeyEvent.VK_S) {
                    avx=0;
                    avy=1;
                }
                if(e.getKeyCode()==KeyEvent.VK_D) {
                    avx=1;
                    avy=0;
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
        setSize(800,600);
        comida=nuevaComida();
    }
    public Comida nuevaComida(){
        int cols=this.getWidth();
        int filas=this.getHeight();
        Random r=new Random();
        int x=r.nextInt(cols);
        int y=r.nextInt(filas);
        return new Comida(x,y);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        s.avanzar(avx,avy);
        g.fillRect(s.posx,s.posy,s.SCL,s.SCL);//pinta la serpiente
        //pinta la cola
        s.cola.forEach((punto)->{
            g.fillRect(punto.x, punto.y,s.SCL,s.SCL);
        });


        //pintar la comida
        if(comida.viva)
        g.fillRect(comida.posx,comida.posy,comida.SCL,comida.SCL);
        else{
            comida=nuevaComida();
            g.fillRect(comida.posx,comida.posy,comida.SCL,comida.SCL);
        }
    }

    @Override
    public void run() {
        while(jugando) {
         //todo verificar la colision comida
            if(Math.abs(s.posx- comida.posx)<s.SCL && Math.abs(s.posy- comida.posy)<s.SCL) {
//                System.out.println("colision");
                s.come(s.posx,s.posy);
                comida.viva=false;
            }
            //todo colision con las orillas
            if(s.posx<0) { //colision por izquierda
                JOptionPane.showMessageDialog(this, "muerto");
                jugando=false;
            }
            if(s.posx> getWidth()){ //colision por derecha
                JOptionPane.showMessageDialog(this, "muerto");
                jugando=false;
            }
            if(s.posy< 0){ //colision por arriba
                JOptionPane.showMessageDialog(this, "muerto");
                jugando=false;
            }
            if(s.posy> getHeight()){ //colision por abajo
                JOptionPane.showMessageDialog(this, "muerto");
                jugando=false;
            }

            //System.out.println(s);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            repaint();
        }
    }
}
