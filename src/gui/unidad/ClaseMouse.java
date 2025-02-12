package gui.unidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ClaseMouse implements MouseListener, MouseMotionListener {
    JFrame Ventana;
    JPanel PanelPrinc;
    JLabel LCoord;

    public ClaseMouse(){
        Ventana=new JFrame("Mouse sobrecarga");
        LCoord=new JLabel("coordenadas");
        Ventana.add(LCoord, BorderLayout.SOUTH);
        Ventana.addMouseListener(this);
        Ventana.addMouseMotionListener(this);
        Ventana.setSize(400,400);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        LCoord.setText("click "+e.getX()+","+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        LCoord.setText("Presionado "+e.getX()+","+e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        LCoord.setText("Arrastrando "+e.getX()+","+e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        new ClaseMouse();
    }
}
