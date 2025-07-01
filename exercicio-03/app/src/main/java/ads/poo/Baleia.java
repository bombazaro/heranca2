package ads.poo;

public class Baleia extends Animal implements Mamifero{

    public Baleia(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.amamentar() + " e " + this.esguichar();
    }

    @Override
    public String amamentar() {
        return "Baleia " + nome + " está amamentando";
    }

    public String esguichar() {
        return "Baleia " + nome + " está esguichando para fora da água";
    }

    @Override
    public String toString() {
        return nome + " é uma baleia";
    }
}
