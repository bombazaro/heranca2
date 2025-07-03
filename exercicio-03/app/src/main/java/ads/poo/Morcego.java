package ads.poo;

public class Morcego extends Animal implements Aereo, Mamifero {

    public Morcego(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.voar() + " e " + this.amamentar();
    }

    @Override
    public String voar() {
        return "Morcego " + nome + " está voando";
    }

    @Override
    public String amamentar() {
        return "Morcego " + nome + " está amamentando";
    }

    @Override
    public String toString() {
        return nome + " é um morcego";
    }
    
}
