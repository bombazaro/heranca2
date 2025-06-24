package ads.poo;

public class Forma {
    protected String corLinha;
    protected double x;
    protected double y;

    public Forma(String corLinha, double x, double y) {
        this.corLinha = corLinha;
        this.x = x;
        this.y = y;
    }

    public String desenhar() {
        return "Desenhou com cor da linha " + corLinha + " nas coordenadas " + x + " " + y;
    }

    public double calcularPerimetro() {
       return 0;
    }
}
