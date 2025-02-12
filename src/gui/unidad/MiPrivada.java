package gui.unidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MiPrivada {
    JFrame Ventana;
    JPanel PanelPrinc;
    JLabel LblCoord;

    MiPrivada(){
        Ventana=new JFrame("Clase Privada");
        PanelPrinc=new JPanel(new BorderLayout());
        LblCoord=new JLabel("Coordenadas");
        PanelPrinc.add(LblCoord,BorderLayout.SOUTH);
        Ventana.add(PanelPrinc);
        PanelPrinc.addMouseListener(new Privada());
        PanelPrinc.addMouseMotionListener(new MiMotion());
        Ventana.setSize(400,400);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    //clase privada
    private class Privada extends MouseAdapter{
        public void mouseClicked(MouseEvent e) {
            LblCoord.setText("Coordenadas:"+e.getX()+","+e.getY());
        }
    }

    private class MiMotion extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e) {
            LblCoord.setText("Arrastrando Coordenadas:"+e.getX()+","+e.getY());
        }
    }

    public static void main(String[] args) {
        new MiPrivada();
    }
}
