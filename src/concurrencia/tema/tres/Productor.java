package concurrencia.tema.tres;

public class Productor implements Runnable{
    SyncStack stack;
    int contador;

    public Productor(SyncStack s){
        stack = s;
        contador=0;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            char c= (char) ('A'+Math.random()*26);
            System.out.println("productor:"+c);
            stack.push(c);
            contador++;
            try {
                Thread.sleep((long) (300*Math.random()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
