package gui.unidad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiMenu {
    JFrame Ventana;
    JMenuBar BarraMenu;
    JMenu Archivo,Editar,AcercaDe;
    JMenuItem Opcion1,Opcion2,Salir;
    JMenuItem M2Opcion1,M2Opcion2;
    JMenuItem M3AcercaDe;
    JDialog DialogoAcercaDe;

    public MiMenu(){
       Ventana=new JFrame("Ejemplo Menu");
       Archivo=new JMenu("Archivo");
       Editar=new JMenu("Editar");
       AcercaDe=new JMenu("Acerca de...");
       BarraMenu=new JMenuBar();
       //opciones menu1
       Opcion1=new JMenuItem("Opcion 1");
       Opcion2=new JMenuItem("Opcion 2");
       Salir=new JMenuItem("Salir");
       //opciones del menu2
        M2Opcion1=new JMenuItem("Opcion 1");
        M2Opcion2=new JMenuItem("Opcion 1");
        //opciones menu 3
        M3AcercaDe=new JMenuItem("Acerca de");
        //Dialogo
        DialogoAcercaDe=new JDialog(Ventana,"Acerca de",false);

        //Construccion del menu
        Archivo.add(Opcion1);
        Archivo.add(Opcion2);
        Archivo.add(Salir);
        //menu 2
        Editar.add(M2Opcion1);
        Editar.add(M2Opcion2);
        //menu 3
        AcercaDe.add(M3AcercaDe);
        BarraMenu.add(Archivo);
        BarraMenu.add(Editar);
        BarraMenu.add(AcercaDe);
        Ventana.setJMenuBar(BarraMenu);
        M3AcercaDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogoAcercaDe.setSize(200,200);
                DialogoAcercaDe.setVisible(true);
                DialogoAcercaDe.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            }
        });
        //Ventana,tamanio,visibilidad
        Ventana.setSize(400,200);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new MiMenu();
    }

}
