package deltaBits;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DeltaBitsTest {

    @Test
    public void test() throws Exception {
        assertThat(DeltaBits.convertBits(31, 14), is(2));
        assertThat(DeltaBits.convertBits(7, 17), is(3));
        assertThat(DeltaBits.convertBits(3, 42), is(3));
    }

}
