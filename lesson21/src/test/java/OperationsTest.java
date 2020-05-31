import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OperationsTest {

    @Test
    public void testDivide() {
        Operations oper = new Operations();
        int x = 6;
        int y = 2;
        int result = oper.divide(x, y);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testDivideBy0() {
        final Operations oper = new Operations();
        int x = 6;
        final int y = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> oper.divide(x, y));
    }

    @Test
    public void testMultiply() {
        Operations oper = new Operations();
        int x = 3;
        int y = 2;
        int result = oper.multiply(x, y);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testMultiplyBy0() {
        Operations oper = new Operations();
        int x = 3;
        int y = 0;
        int result = oper.multiply(x, y);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testSumPositiv() {
        Operations oper = new Operations();
        int x = 2;
        int y = 3;
        int result = oper.sum(x, y);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSumNegativ() {
        Operations oper = new Operations();
        int x = -2;
        int y = -3;
        int result = oper.sum(x, y);
        Assertions.assertEquals(-5, result);
    }

    @Test
    public void testDifferencePositiv() {
        Operations oper = new Operations();
        int x = 5;
        int y = 3;
        int result = oper.difference(x, y);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDifferenceNegativ() {
        Operations oper = new Operations();
        int x = -5;
        int y = -3;
        int result = oper.difference(x, y);
        Assertions.assertEquals(-2, result);
    }
}
