package gui.unidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MiTabs {
    JFrame Ventana;
    JTabbedPane PanelTabsPrinc;
    JPanel PanelDocumento;
    JTextArea textArea;

    MiTabs(){
        Ventana=new JFrame("Tabs");
        PanelTabsPrinc=new JTabbedPane();
        textArea=new JTextArea(17,50);
        PanelDocumento=new JPanel();
        PanelDocumento.add(new JScrollPane(textArea));
        JPanel PanelDocumento2=new JPanel();
        PanelDocumento2.add(new JScrollPane(new JLabel("aksjdhkasdhkja")));
        PanelTabsPrinc.addTab("Tab 1",PanelDocumento);
        PanelTabsPrinc.addTab("Tab 2",PanelDocumento2);
        textArea.addKeyListener(new HandKey());
        Ventana.add(PanelTabsPrinc,BorderLayout.CENTER);
        Ventana.setSize(600,400);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    class HandKey implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
           if (e.getKeyChar()=='q')
               System.out.println(textArea.getText());
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    public static void main(String[] args) {
        new MiTabs();
    }
}
