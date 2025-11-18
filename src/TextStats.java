import java.util.ArrayList;

// TextStats.java
public class TextStats {
    private int lines = 0;
    private int chars = 0;
    private int words = 0;
    private int longestLen = 0;
    private ArrayList<String> longestWords = new ArrayList<>();

    public boolean isStop(String line) {
        return line != null && line.equalsIgnoreCase("stop");
    }

    public void acceptedWords(String line) {

        if (line == null) return;

        lines++;
        chars += line.length();

        // Räkna ord (separerade med blanksteg)
        String trimmed = line.trim();
        if (!trimmed.isEmpty()) {
            String[] tokens = trimmed.split("\\s+");
            words += tokens.length;

            for (String t : tokens) {
                int len = t.length();

                if (len > longestLen) {
                    longestLen = len;      // sätter ordet till det längsta
                    longestWords.clear(); // ta bort ev längsta ord och ersätt med nytt
                    longestWords.add(t);
                } else if (len == longestLen) {
                    longestWords.add(t); // lägg till om lika långt.
                }
            }
        }
    }

    public int getLines() {
        return lines;
    }

    public int getChars() {
        return chars;
    }

    public int getWords() {
        return words;
    }

    public ArrayList<String> getLongestWords() {
        return longestWords;
    }
}
