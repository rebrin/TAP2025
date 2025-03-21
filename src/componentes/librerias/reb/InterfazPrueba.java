package componentes.librerias.reb;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazPrueba extends JFrame {
    private JPanel PanelPrinc;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JTextArea asdlkasdlkjaslkdjaslkdjlaksTextArea;

    public InterfazPrueba() {
        setContentPane(PanelPrinc);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PanelPrinc,"Eventos");
            }
        });
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PanelPrinc,"mensaje 2");
            }
        });
    }

    public static void main(String[] args) {
        new FlatDarculaLaf().setup();
        new InterfazPrueba();
    }
}
