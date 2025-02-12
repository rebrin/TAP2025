package gui.unidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiCard {
    JFrame Ventana;
    JPanel PanelCard;
    JPanel Panel1;// GUI diferente
    JPanel Panel2;
    JPanel Panel3;
    JLabel LblP1;
    JLabel LblP2;
    JLabel LblP3;
    JButton Btn1;
    JButton Btn2;
    JButton Btn3;

    MiCard(){
        Ventana=new JFrame("CardLayout");
        Panel1=new JPanel();
        Panel2=new JPanel();
        Panel3=new JPanel();
        PanelCard=new JPanel(new CardLayout());//cards
        //--------armar cada panel con sus propios componentes
        Panel1.add(LblP1=new JLabel("Panel1"),BorderLayout.NORTH);
        Panel1.add(Btn1=new JButton("next"),BorderLayout.SOUTH);
        ImageIcon img=new ImageIcon(getClass().getResource("./imgs/img_persona.jpg"));
        Image image =img.getImage();
        Image escalada=image.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        img=new ImageIcon(escalada);
        JLabel imagen=new JLabel();

        imagen.setIcon(img);
        Panel1.add(imagen);
        Btn1.addActionListener(new HandlerCard());

        Panel2.add(LblP2=new JLabel("Panel 2"),BorderLayout.NORTH);
        Panel2.add(Btn2=new JButton("next"),BorderLayout.SOUTH);
        Btn2.addActionListener(new HandlerCard());

        Panel3.add(LblP3=new JLabel("Panel 3"),BorderLayout.NORTH);
        Panel3.add(Btn3=new JButton("next"),BorderLayout.SOUTH);
        Btn3.addActionListener(new HandlerCard());

        PanelCard.add(Panel1);
        PanelCard.add(Panel2);
        PanelCard.add(Panel3);

        Ventana.add(PanelCard,BorderLayout.CENTER);

        Ventana.setSize(600,400);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new MiCard();
    }

    class HandlerCard implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl=(CardLayout) PanelCard.getLayout();
            cl.next(PanelCard);
        }
    }
}
