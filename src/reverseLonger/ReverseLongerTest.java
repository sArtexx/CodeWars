package reverseLonger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseLongerTest {

    @Test
    public void static1() {
        assertEquals("abcdetsrifabcde",
                ReverseLonger.shorterReverseLonger("first", "abcde"));
        assertEquals("bauollehbau", ReverseLonger.shorterReverseLonger("hello", "bau"));
        assertEquals("fghiedcbafghi",
                ReverseLonger.shorterReverseLonger("abcde", "fghi"));
    }

}