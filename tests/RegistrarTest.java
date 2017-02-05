import org.junit.Test;

import static org.junit.Assert.*;

public class RegistrarTest {
    @Test
    public void canRegister_1() throws Exception {
        Registrar R = new Registrar();
        boolean actual = R.canRegister(16,2.99);
        boolean expected = false;
        assertEquals(expected,actual);
    }
    @Test
    public void canRegister_2() throws Exception {
        Registrar R = new Registrar();
        boolean actual = R.canRegister(16,3.00);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void canRegister_3() throws Exception {
        //std with gps < 2.0 cannot register
        //without advisor override
        Registrar R = new Registrar();
        boolean actual = R.canRegister(16,1.99);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void canRegister_4() throws Exception {
        //std with gps < 2.0 cannot register
        //without advisor override
        Registrar R = new Registrar();
        R.setOverride(true);
        boolean actual = R.canRegister(16,1.99);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void canRegister_5() {
        Registrar R = new Registrar();
        R.setOverride(true);
        boolean actual = R.canRegister(3,1.50);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void canRegister_6() {
        Registrar R = new Registrar();
        R.setOverride(false);
        boolean actual = R.canRegister(5,1.20);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void canRegister_7() {
        Registrar R = new Registrar();
        R.setOverride(false);
        boolean actual = R.canRegister(20,3.2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void canRegister_8() {
        Registrar R = new Registrar();
        R.setOverride(false);
        boolean actual = R.canRegister(22,2.80);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}