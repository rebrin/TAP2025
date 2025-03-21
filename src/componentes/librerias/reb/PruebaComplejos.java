package componentes.librerias.reb;


import com.rebrin.complejos.NumComplejo;

public class PruebaComplejos {
    public static void main(String[] args) {
        NumComplejo n1=new NumComplejo(1,1);
        NumComplejo n2=new NumComplejo(3,3);

        System.out.println(n1.suma(n2));
        System.out.println(n2.mult(3));
        System.out.println(n2.resta(n1));
    }

}
