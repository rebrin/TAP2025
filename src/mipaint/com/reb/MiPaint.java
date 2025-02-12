package mipaint.com.reb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MiPaint implements MouseListener, MouseMotionListener {
    JFrame Ventana;
    Canvas canvas;
    Integer xini,yini,xfin,yfin;
    ArrayList<Pintable> Figuras=new ArrayList<>();

    MiPaint(){
        xini=yini=xfin=yfin=0;
        Ventana=new JFrame("Mi paint");
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
        Graphics g=canvas.getGraphics();
       xini=e.getX();
       yini=e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //aqui voy a guardar
        int ancho=Math.abs(xini-e.getX());
        int alto=Math.abs(yini-e.getY());
        Figuras.add(new Circulo(xini,yini,ancho,alto));
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
        int ancho=Math.abs(xini-e.getX());
        int alto=Math.abs(yini-e.getY());

        g.drawOval(Math.min(xini,e.getX()),
                Math.min(yini,e.getY()),ancho,alto);

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
