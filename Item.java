public class Item {
    private String nome;
    private boolean stackable;
    private int quantidade;
    private int tamanhoDaPilha;

    public Item(String nome, boolean stackable, int quantidade, int tamanhoDaPilha) {
        this.nome = nome;
        this.stackable = stackable;
        this.quantidade = stackable ? Math.min(quantidade, tamanhoDaPilha) : 1;
        this.tamanhoDaPilha = stackable ? tamanhoDaPilha : 1;
    }

    public Item(String nome) {
        this.nome = nome;
        this.stackable = false;
        this.quantidade = 1;
        this.tamanhoDaPilha = 1;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getTamanhoDaPilha() {
        return tamanhoDaPilha;
    }

    public boolean isStackable() {
        return stackable;
    }

    public String description() {
        if (stackable) {
            return nome + ": " + quantidade + "/" + tamanhoDaPilha;
        }
        return nome;
    }

    public void add(int quantidade) {
        this.quantidade = Math.min(this.quantidade + quantidade, tamanhoDaPilha);
    }
}
