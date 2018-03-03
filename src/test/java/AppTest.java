import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testSmallPrime() {
        App appObj = new App();
        assertEquals(appObj.isPrime(17), true);
    }

    @Test
    public void testSmallNoPrime() {
        App appObj = new App();
        assertEquals(appObj.isPrime(33), false);
    }

    @Test
    public void testLargePrime() {
        App appObj = new App();
        assertEquals(appObj.isPrime(32416189049L), true);
    }

    @Test
    public void testLargeNoPrime() {
        App appObj = new App();
        assertEquals(appObj.isPrime(32416189051L), false);
    }

    @Test
    public void twoPrime() {
        App appObj = new App();
        appObj.countPrimeNumber(1, 5);
        assertTrue(appObj.primeNumbers1.equals("1 2 3 5 "));
    }
}