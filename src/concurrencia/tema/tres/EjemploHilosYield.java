package concurrencia.tema.tres;

public class EjemploHilosYield extends Thread{
    @Override
    public void run() {
        System.out.println("el hilo "
                +Thread.currentThread().getName()+" ha comenzado");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        EjemploHilosYield t1=new EjemploHilosYield();
        EjemploHilosYield t2=new EjemploHilosYield();
        t1.start();
        t2.start();

    }

}
