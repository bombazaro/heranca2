package ads.poo;

public class Ornitorrinco extends Animal implements Oviparo, Terrestre {

    public Ornitorrinco(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return colocarOvo() + " e " + correr();
    }

    @Override
    public String colocarOvo() {
    return "Ornitorrinco " + nome + " está colocando ovo";
    }

    @Override
    public String correr() {
        return "Ornitorrinco " + nome + " está correndo";
    }

    @Override
    public String toString() {
        return nome + " é um Ornitorrinco";
    } 
}
