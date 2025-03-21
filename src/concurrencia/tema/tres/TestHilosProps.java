package concurrencia.tema.tres;

public class TestHilosProps {
    TestHilosProps(){
        HilosProps hp1=new HilosProps("hilo 1");
        HilosProps hp2=new HilosProps("hilo 2");
        HilosProps hp3=new HilosProps("hilo 3");
        HiloPropsRandom hr=new HiloPropsRandom();
        Thread t1=new Thread(hp1);
        Thread t2=new Thread(hp2);
        Thread t3=new Thread(hp3);
        Thread tr=new Thread(hr);
        //t1.setPriority(Thread.MAX_PRIORITY);
        //t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        tr.start();
        try {
            Thread.sleep(10000);
            t1.join();
            if (t1.isAlive() && t2.isAlive())
                System.out.println("estan vivos");
            System.out.println(t1.getPriority());
            System.out.println(t2.getPriority());
            System.out.println(t3.isAlive());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        new TestHilosProps();
    }
}
