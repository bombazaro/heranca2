package ads.poo.jogo;

public class Aldeao extends Personagem {

    public Aldeao() {
        super(25, 1, 0.8);
    }

    public String mover() {
        return "Aldeão moveu na velocidade " + velocidade;
    }

    @Override
    public String atacar() {
        return "Aldeão atacou com força " + ataque;
    }
}
