package concurrencia.tema.tres;

public class CronoContador implements Runnable {
    Cronometro cronometro;
    boolean terminar=false;
    public CronoContador(Cronometro cronometro){
        this.cronometro=cronometro;
    }

    @Override
    public void run() {
        int cont=0;
        while (!terminar){
            try{
                cont++;
                Thread.sleep(1000);
                cronometro.lblCuenta.setText(String.valueOf(cont));
                if(cont==59)
                    cont=0;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
