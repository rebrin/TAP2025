package concurrencia.tema.tres;

public class TestRunner {
    public static void main(String[] args) {
        HelloRunner r1=new HelloRunner("hilo 1");
        HelloRunner r2=new HelloRunner("hilo 2");
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}
