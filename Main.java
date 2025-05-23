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

        System.out.print(nome + "? Uau, que nome legal! ");
        boolean classeValida = false;
        while (!classeValida) {
            System.out.print("Qual é a sua classe?\n(G - Guerreiro | M - Mago | C - Curandeiro | B - Bardo)\n> ");
            classe = scanner.next().charAt(0);
            classe = Character.toUpperCase(classe);

            Personagem heroi;
            heroi = switch (classe) {
                case 'G' -> new Guerreiro(nome);
                case 'M' -> new Mago(nome);
                case 'C' -> new Curandeiro(nome);
                case 'B' -> new Bardo(nome);
                default -> null;
            };
            if (heroi != null) {
                classeValida = true;
                time.add(heroi);
            } else {
                System.out.print("Acho que não entendeu. ");
            }
        }


        System.out.println("");
        time.add(new Guerreiro("Ragnar"));
        time.add(new Mago("Gandalf"));
        time.add(new Curandeiro("Sakura"));
        time.add(new Bardo("Toninho do Pandeiro"));

        for (Personagem membroDoTime : time) {
            membroDoTime.escreveFicha();
        }
        System.out.println("-------------------------");
        for (Personagem membroDoTime : time) {
            membroDoTime.dizNome();
            membroDoTime.ataque();
            if (membroDoTime instanceof Curandeiro curador) {
                curador.curaTime();
            }
            if (membroDoTime instanceof Bardo bardo) {
                bardo.canta();
            }
            System.out.println();
        }
    }
}
