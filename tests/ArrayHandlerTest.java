import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayHandlerTest {
    @Test
    public void getLargestTest_1() {
        ArrayHandler handler = new ArrayHandler();
        int actual = handler.getLargest(new int[] {50,20,30,40});
        int expected = 50;

        assertEquals(expected, actual); //ddddd
    }

    @Test
    public void getLargestTest_2() {
        ArrayHandler handler = new ArrayHandler();
        int actual = handler.getLargest(new int[] {20,50,30,40});
        int expected = 50;

        assertEquals(expected, actual);
    }

    @Test
    public void getLargestTest_3() {
        ArrayHandler handler = new ArrayHandler();
        int actual = handler.getLargest(new int[] {20,50,30,60});
        int expected = 60;

        assertEquals(expected, actual);
    }

}