package concurrencia.tema.tres;

public class EjemploHilosJoin extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("hilo"+
                    Thread.currentThread().getName()+" fue interrumpido");
        }
        System.out.println(Thread.currentThread().getName()+" ha finalizado");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hilo principal inicia");
        EjemploHilosJoin t1=new EjemploHilosJoin();
        EjemploHilosJoin t2=new EjemploHilosJoin();

        t1.start();
        System.out.println("hilo principal esperando a que finalice h1");
        t1.join();

        t2.start();
        System.out.println("hilo principal esperando a que finalice h2");
        t2.join();

        System.out.println("hilo principal finaliza");
    }
}
