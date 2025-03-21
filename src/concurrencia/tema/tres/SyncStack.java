package concurrencia.tema.tres;

import java.util.ArrayList;
import java.util.List;

public class SyncStack {
    List<Character> Buffer=new ArrayList<>(400);

    public synchronized void push(char c){
        this.notify();
        Buffer.add(c);
    }

    public synchronized Character pop(){
        char c;
        while(Buffer.size()==0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        c=Buffer.remove(Buffer.size()-1);
        return c;
    }
}
