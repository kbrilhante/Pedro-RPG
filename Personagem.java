public class Personagem {
    private String nome;
    private char classe;
    private int hpMax, mpMax;
    private int hp, mp;
    private Inventario inventario;

    public Personagem(String nome, char classe) {
        this.nome = nome;
        this.classe = classe;
        hpMax = 100;
        mpMax = 100;
        hp = hpMax;
        mp = mpMax;
        defineStats();
        inventario = new Inventario(8);
        giveStarterKit();
    }

    private void defineStats() {
        hpMax = 100;
        mpMax = 100;

        switch (classe) {
            case 'G':
                hpMax = 150;        
                mpMax = 70;
                break;
            case 'M':
                hpMax = 80;
                mpMax = 200;
                break;
            case 'C':
                mpMax = 150;
                break;
        }
    }

    private void giveStarterKit() {
        inventario.addItem(new Item("Poção de Cura", true, 10, 20));
        inventario.addItem(new Item("Poção de Mana", true, 5, 20));
        inventario.addItem(new Item("Frigideira da Vovó"));
    }

    public void escreveFicha() {
        System.out.println("==== Ficha do Personagem ====");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
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
