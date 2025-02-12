package mipaint.com.reb;

import java.awt.*;

public class Circulo implements Pintable {
    int x,y,ancho,alto;
    Color color;
    public Circulo(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Circulo(int x, int y, int ancho, int alto,Color color) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.color=color;
    }

    @Override
    public void pintar(Graphics g) {
        g.drawOval(x,y,ancho,alto);
    }
}
