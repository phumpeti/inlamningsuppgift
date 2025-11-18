import java.util.Scanner;

public class InlamningsuppgiftApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TextStats stats = new TextStats();


        while (true) {
            System.out.print("Skriv en rad: ");
            String line = in.nextLine();
            if (stats.isStop(line)) break;   // ska inte räknas enl. instruktioner.
            stats.acceptedWords(line);
        }

        System.out.println("Totalt antal tecken: " + stats.getChars());
        System.out.println("Totalt antal rader: " + stats.getLines());
        // Extra utmatning som krävs för del 3.
        System.out.println("Antal ord: " + stats.getWords());
        System.out.println("Längsta ordet/orden: " + stats.getLongestWords());

    }
}
