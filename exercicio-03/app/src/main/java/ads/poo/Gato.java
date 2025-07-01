package ads.poo;

public class Gato extends Animal implements Mamifero, Terrestre{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.amamentar() + " e " + this.correr();
    }

    @Override
    public String amamentar() {
        return "Gato " + nome + " está amamentando";
    }

    @Override
    public String correr() {
        return "Gato " + nome + " está correndo";
    }

    @Override
    public String toString() {
        return nome + " é um gato";
    }
}
