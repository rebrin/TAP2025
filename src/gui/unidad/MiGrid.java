package gui.unidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiGrid {
    JFrame Ventana;
    JPanel PanelGrid;
    JButton [] Botones;

    MiGrid(){
        Ventana=new JFrame("mi Grid");
        Botones=new JButton[10];
        PanelGrid=new JPanel(new GridLayout(4,3));
        for (int i = 0; i < 10; i++) {
            Botones[i]=new JButton("boton "+i);
            PanelGrid.add(Botones[i]);
        }
        Ventana.add(PanelGrid,BorderLayout.CENTER);
        Ventana.setSize(600,400);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new MiGrid();
    }
}
