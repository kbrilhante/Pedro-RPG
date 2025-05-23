import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> time = new ArrayList<>();

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
        Personagem heroi;
        heroi = switch (classe) {
            case 'G' -> new Guerreiro(nome);
            case 'M' -> new Mago(nome);
            case 'C' -> new Curandeiro(nome);
            default -> new Personagem(nome);
        };
        time.add(heroi);


        System.out.println("");
        // time.add(new Personagem("Bob"));
        time.add(new Guerreiro("Ragnar"));
        time.add(new Mago("Gandalf"));
        time.add(new Curandeiro("Sakura"));

        for (Personagem membroDoTime : time) {
            membroDoTime.escreveFicha();
        }
        System.out.println("-------------------------");
        for (Personagem membroDoTime : time) {
            membroDoTime.dizNome();
            if (membroDoTime instanceof Curandeiro curador) {
                curador.curaTime();
            }
        }
    }
}
