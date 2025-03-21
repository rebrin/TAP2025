package concurrencia.tema.tres;
public class HelloRunner implements Runnable{
    String Nombre;
    public HelloRunner(String nombre){
        Nombre=nombre;
    }
    @Override
    public void run() {
        int cont=0;
        while (cont<50){
            cont++;
            System.out.println(Nombre+":"+cont);
        }
    }
}
