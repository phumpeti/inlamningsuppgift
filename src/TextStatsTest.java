
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TextStatsTest {

    @Test
    void stopGivesZero() {  // om först inmatningen är stop ska ingenting räknas.
        TextStats empty = new TextStats();
        assertTrue(empty.isStop("stop"));
        assertTrue(empty.isStop("STOP"));

        assertEquals(0, empty.getLines());
        assertEquals(0, empty.getChars());
        assertEquals(0, empty.getWords());
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, empty.getLongestWords());
    }

    @Test
    void countLinesCharactersWords() { // test att den räknar korrekt.
        TextStats calculate = new TextStats();
        calculate.acceptedWords("hej");           // 1 rad, 3 tecken, 1 ord
        calculate.acceptedWords("hej då");        // +1 rad, +6 tecken, +2 ord

        assertEquals(2, calculate.getLines());
        assertEquals(9, calculate.getChars());
        assertEquals(3, calculate.getWords());
    }

    @Test
    void longestWord() { // hittar det längst ordet även om det skrivs in mer än ett per rad?
        TextStats longest = new TextStats();
        longest.acceptedWords("hej");
        longest.acceptedWords("ett banan");
        longest.acceptedWords("programmering java nisse");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("programmering");
        assertEquals(expected, longest.getLongestWords());
    }
    @Test
    void longestWords() { // hittar det längst ordet även om det skrivs in mer än ett per rad?
        TextStats longestTwoOrMore = new TextStats();
        longestTwoOrMore.acceptedWords("haj");
        longestTwoOrMore.acceptedWords("kaj");
        longestTwoOrMore.acceptedWords("saj");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("haj");
        expected.add("kaj");
        expected.add("saj");
        assertEquals(expected, longestTwoOrMore.getLongestWords());
    }
}
