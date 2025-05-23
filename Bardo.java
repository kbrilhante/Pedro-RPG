public class Bardo extends Personagem {

    public Bardo(String nome) {
        super(nome);
        hpMax = 90;
        mpMax = 130;
        defineStats();
    }

    @Override
    public void dizNome() {
        System.out.println("~~~~ Eu sou " + nome + ", o poeta cancioneiro fazedor de rimas ~~~~");
    }

    @Override
    public void ataque() {
        System.out.println(nome + " canta uma canção que confunde seus inimigos.");
    }
    
    public void canta() {
        System.out.println(nome + " canta:\n\"E nessa loucura\nDe dizer que não te quero\nVou negando as aparências\nDisfarçando as evidencias\"");
    }
}
