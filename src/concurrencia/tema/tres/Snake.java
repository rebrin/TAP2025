package concurrencia.tema.tres;

import java.awt.*;
import java.util.ArrayDeque;

public class Snake {
    int posx,posy;
    int velx,vely;
    final int SCL=10;
    ArrayDeque<Point> cola;
    Graphics g;

    public Snake(int posx, int posy, int velx, int vely) {
        this.posx = posx;
        this.posy = posy;
        this.velx = velx;
        this.vely = vely;
        this.g=g;
        cola=new ArrayDeque<>();
        cola.addFirst(new Point(posx,posy));
    }
    public void setG(Graphics g){
        this.g=g;
    }

    public void avanzar(int dirx,int diry){
        posx+=dirx*SCL;
        posy+=diry*SCL;
        //defasar la cola
        cola.addFirst(new Point(posx,posy));
        cola.removeLast();

    }

    public void come(int cx,int cy){
        cola.push(new Point(cx,cy));
    }

    @Override
    public String toString() {
        return "Snake{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", velx=" + velx +
                ", vely=" + vely +
                '}';
    }
}
