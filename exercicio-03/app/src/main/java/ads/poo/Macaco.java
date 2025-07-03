package ads.poo;

public class Macaco extends Animal implements Terrestre, Mamifero {

    public Macaco(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.amamentar() + " e " + this.correr();
    }

    @Override
    public String amamentar() {
        return "Macaco " + nome + " está amamentando";
    }

    @Override
    public String correr() {
        return "Macaco " + nome + " está correndo";
    }

    @Override
    public String toString() {
        return nome + " é um macaco";
    }
    
}
