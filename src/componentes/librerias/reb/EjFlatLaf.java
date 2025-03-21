package componentes.librerias.reb;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class EjFlatLaf {
    JFrame Ventana;
    JButton B1;
    JButton B2;
    JButton B3;
    JButton B4;
    JButton B5;
    EjFlatLaf(){
        Ventana=new JFrame("FlatLaf");
        B1=new JButton("boton 1");
        B2=new JButton("boton 2");
        B3=new JButton("boton 3");
        B4=new JButton("boton 4");
        B5=new JButton("boton 5");
        Ventana.setLayout(new FlowLayout());
        Ventana.add(B1);
        Ventana.add(B2);
        Ventana.add(B3);
        Ventana.add(B4);
        Ventana.add(B5);
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Ventana,"accion");
            }
        });
        Ventana.setSize(400,300);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
       new FlatDarculaLaf().setup();
        new EjFlatLaf();
    }
}
