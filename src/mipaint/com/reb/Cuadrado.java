package mipaint.com.reb;

import java.awt.*;

public class Cuadrado implements Pintable {
    int x,y,ancho,alto;
    Color color;

    public Cuadrado(int x, int y, int ancho, int alto, Color color) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }

    public Cuadrado(int x, int y, int ancho, int alto) {
        this.alto = alto;
        this.ancho = ancho;
        this.y = y;
        this.x = x;
    }

    @Override
    public void pintar(Graphics g) {
        g.drawRect(x,y,ancho,alto);

    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "x=" + x +
                ", y=" + y +
                ", ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
