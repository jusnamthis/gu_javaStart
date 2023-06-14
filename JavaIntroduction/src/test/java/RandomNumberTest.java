import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {

    @Test
    void getMostSignificantBit() {
        RandomNumber rnd = new RandomNumber(321, 322);
        int actual = rnd.getMostSignificantBit();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void getMultiplesForNumber() {
        RandomNumber rnd = new RandomNumber(51, 52);
        int significantBit = rnd.getMostSignificantBit();
        ExpandableArray multiplesActual = rnd.getMultiplesForNumber(significantBit, 60);
        int[] resultActual = multiplesActual.toArr();

        int[] resultExpected = new int[]{55, 60};

        assertArrayEquals(resultExpected, resultActual);
    }

    @Test
    void getNotMultiplesForNumber() {
        RandomNumber rnd = new RandomNumber(51, 52);
        int significantBit = rnd.getMostSignificantBit();

        ExpandableArray notMultiplesActual = rnd.getNotMultiplesForNumber(significantBit, 47);
        int[] resultActual = notMultiplesActual.toArr();

        int[] resultExpected = new int[]{47, 48, 49, 51};

        assertArrayEquals(resultExpected, resultActual);
    }
}