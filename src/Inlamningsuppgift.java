import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Inlamningsuppgift {
    public static void main(String[] args){
        ArrayList<String> wordList = new ArrayList<>();
        ArrayList<Integer> wordLengthList = new ArrayList<>();
        int summa = 0
        int lineCounter = 0;
        String longestWord = null ;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Skriv en rad: ");
            String word = input.nextLine();
            int index = 0;
            if (word.equalsIgnoreCase("stop")) break;

            wordList.add(word);
            lineCounter++;            // räkna raden
            word_sum++;
            summa += word.length();   // addera tecken
            wordLengthList.add(word.length());
        }
        int max = Collections.max(wordLengthList);
        int index = wordLengthList.indexOf(max);

        System.out.println(wordList);
        System.out.println("Totalt antal tecken: " + summa);
        System.out.println("Längsta ordet är : " + wordList.get(index));
        System.out.println("Totalt antal rader: " + lineCounter);
        input.close();
    }
}


