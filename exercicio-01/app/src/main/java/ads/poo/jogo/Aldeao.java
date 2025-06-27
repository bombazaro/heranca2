package ads.poo.jogo;

public class Aldeao extends Personagem implements Guerreiro, Coletador{

    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String mover() {
        return "Aldeão moveu na velocidade " + velocidade;
    }

    @Override
    public String atacar() {
        return "Aldeão atacou com força " + ataque;
    }

    @Override
    public String coletarMadeira() {
        return "Aldeão coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeão coletando ouro";
    }

//    public String mover() {
//        return "Aldeão moveu na velocidade " + velocidade;
//    }
//
//    @Override
//    public String atacar() {
//        return "Aldeão atacou com força " + ataque;
//    }
}
