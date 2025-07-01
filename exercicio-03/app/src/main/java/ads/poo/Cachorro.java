package ads.poo;

public class Cachorro extends Animal implements Terrestre, Mamifero{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.amamentar() + " e " + this.correr();
    }

    @Override
    public String amamentar() {
        return "Cachorro " + nome + " está amamentando";
    }

    @Override
    public String correr() {
        return "Cachorro" + nome + " está correndo";
    }

    @Override
    public String toString() {
        return nome + " é um cachorro";
    }
}
