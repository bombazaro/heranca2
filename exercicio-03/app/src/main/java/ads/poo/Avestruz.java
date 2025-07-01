package ads.poo;

public class Avestruz extends Animal implements Terrestre, Oviparo{

    public Avestruz(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.colocarOvo() + " e " + this.correr();
    }

    @Override
    public String colocarOvo() {
        return "Avestruz " + nome + " está botando ovo";
    }

    @Override
    public String correr() {
        return "Avestruz " + nome + " está correndo";
    }

    @Override
    public String toString() {
        return nome + " é um avestruz";
    }
}
