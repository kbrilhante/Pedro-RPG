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
}
