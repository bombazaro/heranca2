package ads.poo;

public class Pinguim extends Animal implements Aereo, Oviparo {

    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.voar() + " e " + this.colocarOvo();
    }

    @Override
    public String voar() {
        return "Pinguim " + nome + " está voando";
    }

    @Override
    public String colocarOvo() {
        return "Pinguim " + nome + " está colocando ovo";
    }

    @Override
    public String toString() {
        return nome + " é um pinguim";
    }
}
