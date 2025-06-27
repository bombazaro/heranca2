package ads.poo.jogo;

public class Arqueiro extends Personagem implements Guerreiro {
    public Arqueiro() {
        super(35, 2, 1);
    }

    @Override
    public String mover() {
        return "Arqueiro moveu na velocidade " + velocidade;
    }

    @Override
    public String atacar() {
        return "Arqueiro atacou com força " + ataque;
    }

//    public String mover() {
//        return "Arqueiro moveu na velocidade " + velocidade;
//    }
//
//    @Override
//    public String atacar() {
//        return "Arqueiro atacou com força " + ataque;
//    }
}
