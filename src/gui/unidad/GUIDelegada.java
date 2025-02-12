package gui.unidad;

import javax.swing.*;

public class GUIDelegada {
    JFrame Ventana;
    JButton Boton;
    JPanel PanelPrinc;
    EventoDelegada Delegada;

    GUIDelegada(){
        Ventana=new JFrame("Modelo delegado");
        Boton=new JButton("click");
        PanelPrinc=new JPanel();
        Delegada=new EventoDelegada();//manejador evento
        //construir
        PanelPrinc.add(Boton);
        Ventana.add(PanelPrinc);
        Boton.addActionListener(Delegada);
        //opciones de ventana
        Ventana.setSize(200,200);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new GUIDelegada();
    }

}
