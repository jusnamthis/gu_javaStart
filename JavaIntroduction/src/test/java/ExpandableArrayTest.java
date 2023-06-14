import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpandableArrayTest {
    @Test
    void push() {
        ExpandableArray ea = new ExpandableArray();
        ea.push(5);
        ea.push(7);

        int[] eaArr = ea.toArr();

        assertArrayEquals(new int[]{5, 7}, eaArr);
    }
}