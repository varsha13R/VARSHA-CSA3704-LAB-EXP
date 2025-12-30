package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exp19_LeapYearTest {

    public static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    @Test
    public void testLeap() {
        assertEquals(true, isLeap(2024));
    }
}
