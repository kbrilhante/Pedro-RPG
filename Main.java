import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        char classe;
        Personagem heroi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem vindo, aventureiro. Qual é o seu nome?\n> ");
        nome = scanner.nextLine();

        System.out.print(nome + "? Uau, que nome legal! Qual é a sua classe?\n(G - Guerreiro | M - Mago | C - Curandeiro)\n> ");
        classe = scanner.next().charAt(0);
        classe = Character.toUpperCase(classe);
        scanner.nextLine();

        heroi = new Personagem(nome, classe);

        heroi.addInventario(new Item("Poção de Cura", true, 5, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 18, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 18, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 18, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 18, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 18, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 18, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 18, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 18, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 18, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 18, 20));
        heroi.addInventario(new Item("Poção de Cura", true, 5, 20));

        heroi.escreveFicha();
    }
}
