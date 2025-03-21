package concurrencia.tema.tres;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cronometro extends JFrame {
    private JButton iniciarButton;
    public JLabel lblCuenta;
    private JPanel main_panel;
    private JButton pararButton;
    private CronoContador contador;
    private  Thread t1;

    public Cronometro(){
        contador=new CronoContador(this);
        t1=new Thread(contador);
        setContentPane(main_panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }
        });
        pararButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador.terminar=true;
            }
        });
    }
    public static void main(String[] args) {
        new Cronometro();
    }
}
