package gui.unidad;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MiGridBagLay {
    JFrame Ventana;
    JButton B1;
    JButton B2;
    JButton B3;
    JButton B4;
    JButton B5;
    JPanel PanelGridBag;
    MiGridBagLay(){
        Ventana=new JFrame("nuestra Gridbag");
        B1=new JButton("Boton1");
        B2=new JButton("Boton2");
        B3=new JButton("Boton3");
        B4=new JButton("Boton4");
        B5=new JButton("Boton5");
        PanelGridBag=new JPanel();
        PanelGridBag.setLayout(new GridBagLayout());
        //construccion
        GridBagConstraints gc=new GridBagConstraints();
        //boton 1
        gc.gridx=0;
        gc.gridy=0;
        gc.weightx=0.1;
        gc.fill=GridBagConstraints.HORIZONTAL;
        PanelGridBag.add(B1,gc);
        //boton 2
        gc=new GridBagConstraints();
        gc.gridx=1;
        gc.gridy=0;
        gc.weightx=0.1;
        gc.fill=GridBagConstraints.HORIZONTAL;
        PanelGridBag.add(B2,gc);
        //Boton 3
        gc=new GridBagConstraints();
        gc.gridx=0;
        gc.gridy=3;
        gc.weightx=0.1;
        gc.anchor=GridBagConstraints.LINE_START;
        gc.fill=GridBagConstraints.HORIZONTAL;
        PanelGridBag.add(B3,gc);
        //boton4
        gc=new GridBagConstraints();
        gc.gridx=2;
        gc.gridy=1;
        gc.gridheight=3;
        gc.fill=GridBagConstraints.BOTH;
        gc.weighty=0.1;
        gc.weightx=0.1;
        PanelGridBag.add(B4,gc);
        //boton 5
        gc=new GridBagConstraints();
        gc.gridx=1;
        gc.gridy=4;
        gc.gridwidth=2;
        gc.fill=GridBagConstraints.HORIZONTAL;
        gc.insets=new Insets(10,0,0,0);
        PanelGridBag.add(B5,gc);
        ImageIcon img=new ImageIcon(Objects
                .requireNonNull(getClass()
                        .getResource("./imgs/img_persona.jpg")));
        Ventana.setIconImage(img.getImage());
        Ventana.add(PanelGridBag,BorderLayout.CENTER);
        Ventana.setSize(400,170);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new MiGridBagLay();
    }
}
