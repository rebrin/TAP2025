package gui.unidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MiMouseAdaptadora extends MouseAdapter {
    //objetos
    JFrame Ventana;
    JPanel Panel;
    JLabel LblCoord;
    //constructor
    MiMouseAdaptadora(){
        //pedir memoria
        Ventana=new JFrame("Adaptadora");
        Panel=new JPanel(new BorderLayout());
        LblCoord=new JLabel("coordenadas:");
        //construir la GUI
        Panel.add(LblCoord,BorderLayout.SOUTH);
        Ventana.add(Panel);
        Panel.addMouseListener(this);//quien se encarga de gestionar
        //finalizacion de ventana
        Ventana.setSize(400,400);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);

    }
    //gestion del clic
    public void mouseClicked(MouseEvent e){
        LblCoord.setText("coordenadas:"+e.getX()+","+e.getX());
    }

    //main
    public static void main(String[] args) {
        new MiMouseAdaptadora();
    }
}
