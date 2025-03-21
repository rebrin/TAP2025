package concurrencia.tema.tres;

public class HilosProps implements  Runnable{
    private String Nombre;
    public HilosProps(String n){
        Nombre=n;
    }
    @Override
    public void run() {
        try {
            int cont=0;
            while (true){
                Thread.sleep(500);
                System.out.println(Nombre+":"+cont++);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
