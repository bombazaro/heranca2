package ads.poo;

public class Lobo extends Animal implements Terrestre, Mamifero {

    public Lobo(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.amamentar() + " e " + this.correr();
    }

    @Override
    public String amamentar() {
        return "Lobo " + nome + " está amamentando";
    }

    @Override
    public String correr() {
        return "Lobo " + nome + " está correndo";
    }

    @Override
    public String toString() {
        return nome + " é um lobo";
    }
}
