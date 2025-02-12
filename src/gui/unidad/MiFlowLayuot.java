package gui.unidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiFlowLayuot {
    JFrame Ventana;
    JButton[] botones;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;

    MiFlowLayuot(){
        //inicializar
        Ventana=new JFrame("FlowLayout");
        botones=new JButton[5];
        //b1=new JButton("boton 1");
        b2=new JButton("boton 2");
        b3=new JButton("boton 3");
        b4=new JButton("boton 4");
        b5=new JButton("boton 5");
        //construimos
        Ventana.setLayout(new FlowLayout());
        /*Ventana.add(b1);
        Ventana.add(b2);
        Ventana.add(b3);
        Ventana.add(b4);
        Ventana.add(b5);*/
        for (int i = 0; i < botones.length; i++) {
            botones[i]=new JButton("boton "+i);
            Ventana.add(botones[i]);
        }
        //finalizamos
        Ventana.setSize(400,400);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new MiFlowLayuot();
    }
}
