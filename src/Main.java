import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lista domande
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Qual è la capitale d'Italia?"));
        questions.add(new Question("Quanto fa 2 + 2?"));
        questions.add(new Question("Chi ha scritto la Divina Commedia?"));

        System.out.println("Inserisci nome Giocatore 1:");
        Player p1 = new Player(scanner.nextLine());

        System.out.println("Inserisci nome Giocatore 2:");
        Player p2 = new Player(scanner.nextLine());

        System.out.println("Inserisci punteggio massimo da raggiungere:");
        int target = scanner.nextInt();

        if (target > questions.size()) {
            System.out.println("Errore: il punteggio non può superare il numero di domande.");
            return;
        }

        Game game = new Game(questions, p1, p2, target);
        game.start();
    }
}