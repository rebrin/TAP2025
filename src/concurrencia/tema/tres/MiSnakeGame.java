package concurrencia.tema.tres;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MiSnakeGame  {
    JFrame ventana;
    JMenuBar menuBar;
    JMenu menuJugar;
    JMenuItem iniciar;
    PanelJuego panelJuego;
    Snake s;

    MiSnakeGame(){
        panelJuego=new PanelJuego();
        ventana=new JFrame("Mi Snake");
        menuJugar=new JMenu("Juego");
        iniciar=new JMenuItem("iniciar");
        menuJugar.add(iniciar);
        menuBar=new JMenuBar();
        menuBar.add(menuJugar);
        ventana.setJMenuBar(menuBar);
        ventana.add(panelJuego,BorderLayout.CENTER);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800,600);
        ventana.setVisible(true);
        Thread t=new Thread(panelJuego);
        t.start();
    }


    public static void main(String[] args) {
        new MiSnakeGame();
    }


}
