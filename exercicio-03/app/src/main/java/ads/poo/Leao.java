package ads.poo;

public class Leao extends Animal implements Terrestre, Mamifero{

    public Leao(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.amamentar() + " e " + this.correr();
    }

    @Override
    public String amamentar() {
        return "Leão " + nome + " está amamentando";
    }

    @Override
    public String correr() {
        return "Leão " + nome + " está correndo";
    }

    @Override
    public String toString() {
        return nome + " é um leão";
    }
}
