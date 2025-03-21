package concurrencia.tema.tres;

public class HiloPropsRandom implements Runnable{
    @Override
    public void run() {
        int cont=0;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (cont<50){
            System.out.println("num:"+Math.random()*100);
            cont++;
        }
    }
}
