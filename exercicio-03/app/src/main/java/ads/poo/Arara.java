package ads.poo;

public class Arara extends Animal implements Aereo, Oviparo {

    public Arara(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.voar() + " e " + this.colocarOvo();
    }

    @Override
    public String voar() {
        return "Arara " + nome + " está voando";
    }

    @Override
    public String colocarOvo() {
        return "Arara " + nome+ " está botando ovo";
    }

    @Override
    public String toString() {
        return nome + " é uma arara";
    }
}
