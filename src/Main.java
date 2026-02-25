import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Lista domande
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Qual'è il film in cui compari la citazione, Huston abbiamo un problema?"));
        questions.add(new Question("In che film si dice che \"la vita è come una scatola di cioccolatini\"?"));
        questions.add(new Question("In quale città italiana è ambientato il film The Tourist con Angelina Jolie e Johnny Depp?"));
        questions.add(new Question("A quale animale è associato Kraven il cacciatore?"));
        questions.add(new Question("Nel Miglio Verde quale animale viene salvato da John Coffey?"));
        questions.add(new Question("Quanti sono i Cavalieri in Now You See Me nella saga?"));
        questions.add(new Question("Nel film 300 quanti spartani rimangono in vita dalla battaglia per fermare i Persiani?"));
        questions.add(new Question("Come si definisce Tony Stark nel primo film degli Avengers?"));
        questions.add(new Question("Chi interpretò lo Spaventapasseri ne Il Cavaliere Oscuro?"));
        questions.add(new Question("Chi interpreta Tomb Raider nel 2001?"));
        questions.add(new Question("In che anno uscì Captain America: Il primo vendicatore?"));
        questions.add(new Question("Di chi è la frase: \"Non c'è cattivo più cattivo di un buono che diventa cattivo\"?"));
        questions.add(new Question("Dove creò Tony Stark il primo prototipo di armatura Iron Man?"));
        questions.add(new Question("Qual è il plot twist ricorrente in ogni Scream?"));
        questions.add(new Question("Quanti sono i film Marvel con Avengers nel nome?"));
        questions.add(new Question("\"Dopotutto, domani è un altro giorno\" da quale film deriva questa celebre frase?"));
        questions.add(new Question("In \"Io sono leggenda\" su chi vengono fatti i test per la cura?"));
        questions.add(new Question("\"Fare o non fare, non c'è provare\" è della famosissima saga...?"));
        questions.add(new Question("\"Al mio via scatenate l'inferno\" è una frase ripresa da quale film?"));
        questions.add(new Question("Qual è il film con più Oscar al mondo?"));

        questions.add(new Question("Chi ha scritto la Divina Commedia?"));
        System.out.println("Inserisci nome Giocatore 1:");
        Player p1 = new Player(scanner.nextLine());

        System.out.println("Inserisci nome Giocatore 2:");
        Player p2 = new Player(scanner.nextLine());

        System.out.println("Inserisci punteggio massimo da raggiungere:");
        int target = scanner.nextInt();

        if (target > questions.size()) {
            throw new Exception("Errore: il punteggio non può superare il numero di domande.");
        }

        Game game = new Game(questions, p1, p2, target);
        game.start();
    }
}