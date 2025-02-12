package gui.unidad;

import javax.swing.*;
import java.awt.*;

public class MiBorderLayout {
    JFrame Ventana;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;

    MiBorderLayout(){
        //inicializacion de componentes
        Ventana=new JFrame("BorderLayout");
        b1=new JButton("Norte");
        b2=new JButton("South");
        b3=new JButton("east");
        b4=new JButton("West");
        b5=new JButton("Center");
        JPanel panelCentral=new JPanel();
        //construccion de la GUI
        Ventana.add(b1, BorderLayout.NORTH);
        Ventana.add(b2, BorderLayout.SOUTH);
        Ventana.add(b3, BorderLayout.EAST);
        Ventana.add(b4, BorderLayout.WEST);
        panelCentral.add(b5);
        Ventana.add(panelCentral, BorderLayout.CENTER);
        //construccion final
        Ventana.setSize(400,400);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new MiBorderLayout();
    }
}
