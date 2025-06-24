package ads.poo.jogo;

public class Cavaleiro extends Personagem {
    public Cavaleiro() {
        super(50, 3, 2);
    }

    public String mover() {
        return "Cavaleiro moveu na velocidade " + velocidade;
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacou com força " + ataque;
    }
}
