public class Personagem {
    protected String nome;
    protected int hpMax, mpMax;
    protected int hp, mp;
    protected Inventario inventario;

    public Personagem(String nome) {
        this.nome = nome;
        hpMax = 100;
        mpMax = 100;
        defineStats();
        inventario = new Inventario(8);
        giveStarterKit();
    }

    protected void defineStats() {
        hp = hpMax;
        mp = mpMax;
    }

    private void giveStarterKit() {
        inventario.addItem(new Item("Poção de Cura", true, 10, 20));
        inventario.addItem(new Item("Poção de Mana", true, 5, 20));
        inventario.addItem(new Item("Frigideira da Vovó"));
    }

    public void escreveFicha() {
        System.out.println("==== Ficha do Personagem ====");
        System.out.println("Nome: " + nome);
        System.out.println("HP: " + hp + "/" + hpMax);
        System.out.println("MP: " + mp + "/" + mpMax);
        inventario.listaItens();
        System.out.println();
    }

    public void addInventario(Item item) {
        if (inventario.addItem(item) > 0) {
            System.out.println("Inventário cheio");
        }
    }
}
