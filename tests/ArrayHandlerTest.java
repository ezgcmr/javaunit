import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayHandlerTest {
    @Test
    public void getLargestTest_1() throws Exception {
        ArrayHandler handler = new ArrayHandler();
        int actual = handler.getLargest(new int[] {50,20,30,40});
        int expected = 50;

        assertEquals(expected, actual);
    }

    @Test
    public void getLargestTest_2() throws Exception {
        ArrayHandler handler = new ArrayHandler();
        int actual = handler.getLargest(new int[] {20,50,30,40});
        int expected = 50;

        assertEquals(expected, actual);
    }

    @Test
    public void getLargestTest_3() throws Exception {
        ArrayHandler handler = new ArrayHandler();
        int actual = handler.getLargest(new int[] {20,50,30,60});
        int expected = 60;

        assertEquals(expected, actual);
    }

    @Test
    public void getLargestTest_4() throws Exception {
        ArrayHandler handler = new ArrayHandler();
        int actual = handler.getLargest(new int[] {-30, -4, -26, -18});
        int expected = -4;

        assertEquals(expected, actual);
    }

    @Test
    public void getLargestTest_5() throws Exception {
        ArrayHandler handler = new ArrayHandler();
        int actual = handler.getLargest(new int[] {});
        int expected = Integer.MIN_VALUE;

        assertEquals(expected, actual);
    }
}