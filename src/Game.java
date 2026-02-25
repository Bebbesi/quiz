import java.util.*;

public class Game {

    private List<Question> questions;
    private Player player1;
    private Player player2;
    private int targetScore;
    private Random random;

    public Game(List<Question> questions, Player p1, Player p2, int targetScore) {
        this.questions = questions;
        this.player1 = p1;
        this.player2 = p2;
        this.targetScore = targetScore;
        this.random = new Random();
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);
        int turno = 0; // 0 = player1, 1 = player2

        while (!questions.isEmpty() &&
                player1.getScore() < targetScore &&
                player2.getScore() < targetScore) {

            // Domanda casuale (e rimossa)
            Question q = questions.remove(random.nextInt(questions.size()));

            // Alternanza turni
            Player current;
            if (turno % 2 == 0) {
                current = player1;
            } else {
                current = player2;
            }

            System.out.println("\nDomanda per: " + current.getName());
            System.out.println(q.getText());
            System.out.println("Inserisci 1 se corretta, 0 se skip:\uD83D\uDCE1");

            int risposta = scanner.nextInt();

            if (risposta == 1) {
                current.addPoint();
            }

            System.out.println("Punteggi attuali:");
            System.out.println(player1.getName() + ": " + player1.getScore());
            System.out.println(player2.getName() + ": " + player2.getScore());

            turno++; // passa al turno successivo
        }

        // Determinazione vincitore
        if (player1.getScore() > player2.getScore()) {
            System.out.println("\n Vince: " + player1.getName());
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("\n Vince: " + player2.getName());
        } else {
            System.out.println("\n Pareggio!");
        }
    }
}