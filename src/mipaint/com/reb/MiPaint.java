package mipaint.com.reb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MiPaint implements MouseListener, MouseMotionListener {
    JFrame Ventana;
    Canvas canvas;
    int xini,yini,xfin,yfin;

    JMenuBar BarraMenu;
    JMenu MenuFig;
    JMenuItem MICirculo,MICuadrado;
    Integer opcionFig; //0 circulo, 1 cuadrado.
    ArrayList<Pintable> Figuras=new ArrayList<>();

    MiPaint(){
        xini=yini=xfin=yfin=opcionFig=0;
        Ventana=new JFrame("Mi paint");
        BarraMenu=new JMenuBar();
        MenuFig=new JMenu("Figura");
        MICirculo=new JMenuItem("Circulo");
        MICuadrado=new JMenuItem("Cuadrado");
        MICirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcionFig=0;
            }
        });
        MICuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcionFig=1;
            }
        });
        MenuFig.add(MICirculo);
        MenuFig.add(MICuadrado);
        BarraMenu.add(MenuFig);
        Ventana.setJMenuBar(BarraMenu);

        canvas=new Canvas(){
            public void paint(Graphics g) {
            }
        };
        Ventana.add(canvas);
        canvas.addMouseListener(this);
        canvas.addMouseMotionListener(this);
        Ventana.setSize(400,300);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new MiPaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // Graphics g=canvas.getGraphics();
        xini=e.getX();
        yini=e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        switch (opcionFig){
            case 0:
                Figuras.add(new Circulo(Math.min(xini,e.getX())
                        ,Math.min(yini,e.getY()),
                        e.getX()-xini,
                        e.getY()-yini));
                break;
            case 1:
                Figuras.add(new Cuadrado(Math.min(xini,e.getX())
                        ,Math.min(yini,e.getY())
                        ,e.getX()-xini
                        ,e.getY()-yini));
                break;
        }
        xini=0;
        yini=0;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g=canvas.getGraphics();
        canvas.update(g);
        for (Pintable fig:Figuras){
            fig.pintar(g);
        }
        //xini=;
        //yini=;
        int ancho=Math.abs(xini-e.getX());
        int alto=Math.abs(yini-e.getY());
        if(opcionFig ==0) {

            g.drawOval(Math.min(xini, e.getX())
                    , Math.min(yini, e.getY())
                    , ancho, alto);
        }
        else{
            g.drawRect(Math.min(xini,e.getX())
                    ,Math.min(yini,e.getY())
                    ,ancho,alto);
        }

        xfin=e.getX();
        yfin=e.getY();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
