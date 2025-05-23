public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome);
        hpMax = 80;
        mpMax = 200;
        defineStats();
    }

    @Override
    public void dizNome() {
        System.out.println("*~*~ Eu sou " + nome + ". Mestre do poder arcano! ~*~*");
    }

    @Override
    public void ataque() {
        System.out.println(nome + " não liga para o tamanho da sala e lança uma bola de fogo.");
    }

    
}
