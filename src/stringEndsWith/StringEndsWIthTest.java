package stringEndsWith;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringEndsWIthTest {

    @Test
    public void testSomething() {
        assertEquals(true, StringEndsWith.solution("abc", "abcd"));
        assertEquals(true, StringEndsWith.solution("abc", "abc"));
        assertEquals(true, StringEndsWith.solution("abc", "bc"));
        assertEquals(false, StringEndsWith.solution("abc", "d"));
    }

}
