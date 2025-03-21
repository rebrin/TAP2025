package concurrencia.tema.tres;

import org.jfree.data.time.Year;

public class TestProductorConsumidor {
    public static void main(String[] args) {
        SyncStack stack=new SyncStack();
        Productor p1=new Productor(stack);
        Thread t1=new Thread(p1);
        Consumidor c1=new Consumidor(stack);
        Thread t2=new Thread(c1);
        Productor p2=new Productor(stack);
        Thread t3=new Thread(p1);
        Consumidor c2=new Consumidor(stack);
        Thread consumidor2=new Thread(c2);
        Consumidor c3=new Consumidor(stack);
        Thread consumidor3=new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
        consumidor2.start();
        consumidor3.start();
    }
}
