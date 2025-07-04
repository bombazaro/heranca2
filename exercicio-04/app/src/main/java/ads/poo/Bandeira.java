package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class Bandeira {
    private double x;
    private double y;
    private double escala;

    public Bandeira(double x, double y, double escala) {
        this.x = x;
        this.y = y;
        this.escala = escala;
    }

    public void desenhar(Draw draw) {
        draw.setPenColor(255,255,255);
        draw.filledRectangle(x, y, (.4 * escala), (.25 * escala));
        draw.setPenColor(0,0,0);
        draw.rectangle(x, y, (.4 * escala), (.25 * escala));
        draw.setPenColor(255,0,0);
        draw.filledCircle(x, y, (.15 * escala));
    }
}
