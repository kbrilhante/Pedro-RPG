
import java.util.ArrayList;

public class Inventario {
    private int capacidade;
    private ArrayList<Item> itens;

    public Inventario(int capacidade) {
        this.capacidade = capacidade;
        this.itens = new ArrayList<>();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }
    
    public void listaItens() {
        if (itens.size() > 0) {
            System.out.println("---- Inventário ----");
            for (Item item : itens) {
                System.out.println(item.description());
            }
        } else {
            System.out.println("---- Inventário Vazio ----");
        }
    }

    public int addItem(Item item) {
        int queroAdicionar = item.getQuantidade();
        if (item.isStackable()) {
            for (Item itemInventario : itens) {
                if (itemInventario.getNome().equals(item.getNome())) {
                    int possoAdicionar = itemInventario.getTamanhoDaPilha() - itemInventario.getQuantidade();
                    int qtd = Math.min(queroAdicionar, possoAdicionar);
                    itemInventario.add(qtd);
                    queroAdicionar -= qtd;
                    if (queroAdicionar == 0) {
                        return 0;
                    }
                }
            }
        }
        if (capacidade > itens.size()) {
            itens.add(new Item(item.getNome(), item.isStackable(), queroAdicionar, item.getTamanhoDaPilha()));
            return 0;
        }
        return queroAdicionar;
    }


}
