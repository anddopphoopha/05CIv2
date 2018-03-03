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
<<<<<<< HEAD
    public void onePrime() {
        App appObj = new App();
        appObj.primeFactor(147);
        assertTrue(appObj.primeFactors.equals("3 7 7 "));
    }

    @Test
    public void oneNotPrime() {
        App appObj = new App();
        appObj.primeFactor(35);
        assertTrue(appObj.primeFactors.equals("5 7 "));
    }
}
=======
    public void twoPrime() {
        App appObj = new App();
        appObj.countPrimeNumber(1, 5);
        assertTrue(appObj.primeNumbers1.equals("1 2 3 5 "));
    }
}
>>>>>>> Feature2
