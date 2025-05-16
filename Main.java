import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagem heroi;
        String nome;
        char classe;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem vindo, aventureiro. Qual é o seu nome?\n> ");
        nome = scanner.nextLine();

        System.out.print(
                nome + "? Uau, que nome legal! Qual é a sua classe?\n(G - Guerreiro | M - Mago | C - Curandeiro)\n> ");
        classe = scanner.next().charAt(0);
        classe = Character.toUpperCase(classe);
        scanner.nextLine();

        heroi = switch (classe) {
            case 'G' -> new Guerreiro(nome);
            case 'M' -> new Mago(nome);
            case 'C' -> new Curandeiro(nome);
            default -> new Personagem(nome);
        };

        heroi.escreveFicha();
    }
}
