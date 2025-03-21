package concurrencia.tema.tres;

import componentes.librerias.reb.InterfazPrueba;

public class PiMontecarloHilos {
    final static Long[] Dentro = {0l};
    final static Long[] Cuenta = {0l};
    final static Long limite=1000000l;
    public static synchronized void Montecarlo(){
        for (int i = 0; i < limite; i++) {
            double x,y;
            x=Math.random();
            y=Math.random();
            Cuenta[0]++;
            if((x*x+y*y)<=1){
                Dentro[0]++;
            }
        }
    }

    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Montecarlo();
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
               Montecarlo();
            }
        });

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                Montecarlo();
            }
        });


        t1.start();
        t2.start();
        //t3.start();
        //hilo principal
        Integer i=0;
        while (true){
            Double pi=4.0*Dentro[0]/Cuenta[0];
            System.out.println("valor pi: "+pi);
            i++;
        }
    }
}
