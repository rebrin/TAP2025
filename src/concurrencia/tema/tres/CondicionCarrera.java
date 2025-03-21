package concurrencia.tema.tres;

public class CondicionCarrera {
    int saldo;
    public CondicionCarrera(){
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    //retirar
                    saldo-=10;
                    System.out.println("retiro:"+saldo);
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    //depositar
                    saldo+=10;
                    System.out.println("deposito:"+saldo);
                }
            }
        });

        t2.start();
        t1.start();
        System.out.println(saldo);
    }

    public static void main(String[] args) {
        new CondicionCarrera();
    }
}
