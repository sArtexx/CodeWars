package meanVsMedian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MeanVsMedianTest {

    @Test
    public void test1() {
        assertEquals("same", MeanVsMedian.meanVsMedian(new int[] { 1, 1, 1 }));
    }

    @Test
    public void test2() {
        assertEquals("mean", MeanVsMedian.meanVsMedian(new int[] { 1, 2, 37 }));
    }

    @Test
    public void test3() {
        assertEquals("median", MeanVsMedian.meanVsMedian(new int[] { 7, 14, -70 }));
    }

}
