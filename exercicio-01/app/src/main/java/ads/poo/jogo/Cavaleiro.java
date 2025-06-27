package ads.poo.jogo;

public class Cavaleiro extends Personagem implements Guerreiro{
    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String mover() {
        return "Cavaleiro moveu na velocidade " + velocidade;
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacou com força " + ataque;
    }

//    public String mover() {
//        return "Cavaleiro moveu na velocidade " + velocidade;
//    }
//
//    @Override
//    public String atacar() {
//        return "Cavaleiro atacou com força " + ataque;
//    }
}
