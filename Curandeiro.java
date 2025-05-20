public class Curandeiro extends Personagem{
    private int poderDeCura;

    public Curandeiro(String nome) {
        super(nome);
        mpMax = 150;
        poderDeCura = 20;
        defineStats();
    }

    public void curaTime() {
        System.out.println(nome + " cura seu grupo em " + poderDeCura + " hp.");
    }

    @Override
    public void dizNome() {
        System.out.println("++++ Eu sou " + nome + ". Guardião da cura suprema! ++++");
    }
}
