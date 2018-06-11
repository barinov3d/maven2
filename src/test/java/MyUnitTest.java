import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {

    @Test
    public void testConcatenate() {
        Main myUnit = new Main();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);
    }

    @Test
    public void testAdd() {
        Main myUnit = new Main();

        int result1 = myUnit.add(1, 2);
        int result2 = myUnit.add(10, 0);
        int result3 = myUnit.add(-13, 15);
        int result4 = myUnit.add(2140000000, 100);
        int result5 = myUnit.add(-15, -2);

        assertEquals(3, result1);
        assertEquals(10, result2);
        assertEquals(2, result3);
        assertEquals(2140000100, result4);
        assertEquals(-17, result5);
    }
}