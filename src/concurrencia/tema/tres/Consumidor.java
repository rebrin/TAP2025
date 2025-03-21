package concurrencia.tema.tres;

public class Consumidor implements Runnable {
    SyncStack stack;
    int contador;
    public Consumidor(SyncStack ref){
        stack=ref;
        contador=0;
    }
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            contador++;
            char c=stack.pop();
            System.out.println("consumidor:"+c);
            try {
                Thread.sleep((long) (300*Math.random()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
