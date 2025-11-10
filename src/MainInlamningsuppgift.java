import java.util.ArrayList;
import java.util.Scanner;

public class MainInlamningsuppgift {

    public class Words {
        ArrayList<String> wordList = new ArrayList<>();
        ArrayList<Integer> wordLengthList = new ArrayList<>();
        int summa = 0;
        private int index  = 0;
        private int max = 0;
        int lineCounter = 0;

        public Words (int summa, int lineCounter, ArrayList<String> wordList, ArrayList<Integer> wordLengthList ) {
            this.summa = summa;
            this.lineCounter = lineCounter;
            this.wordList = wordList;
            this.wordLengthList = wordLengthList;
        }

        public ArrayList<String> getWordList() {
            return wordList;
        }

        public ArrayList<Integer> getWordLengthList() {
            return wordLengthList;
        }
        public String getWord {
            return word;
        }

        public void setResults {
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.print("Skriv en rad: ");
                String word = input.nextLine();
                // word.inCaseofStop
                // kalla på en metod som bryter innan ordet läggs till.
                wordList.add(word);
                return wordList;
            }
        }
        public void printResults {
            System.out.println(wordList);
            System.out.println("Totalt antal tecken: " + summa);
            System.out.println("Längsta ordet är : " + wordList.get(index));
            System.out.println("Totalt antal rader: " + lineCounter);
            }
        }

}
