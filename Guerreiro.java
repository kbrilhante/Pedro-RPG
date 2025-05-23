public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome);
        hpMax = 150;
        mpMax = 70;
        defineStats();
    }

    @Override
    public void dizNome() {
        System.out.println("<<<< Eu sou " + nome + ". A fúria do machado! >>>>");
    }

    @Override
    public void ataque() {
        System.out.println(nome + " ataca com seu machado, usando toda sua força.");
    }

    
}
