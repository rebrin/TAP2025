package gui.unidad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIEvento1 {

    //Contenedor
    JFrame ventana;
    JPanel panel_princ;
    //componentes
    JButton b;
    JTextField TFNombre;
    //constructor
    public GUIEvento1(){
        ventana=new JFrame("primer programa");
        b=new JButton("presiona");
        TFNombre=new JTextField(20);
        panel_princ=new JPanel();
        panel_princ.add(TFNombre);
        panel_princ.add(b);
        ventana.add(panel_princ);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hola eventos");
                String nombre=TFNombre.getText();
                JOptionPane.showMessageDialog(ventana,"hola "+nombre);
            }
        });

        ventana.setSize(400,400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new GUIEvento1();
    }
}
