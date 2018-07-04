import org.junit.Test;
import org.junit.Assert;
/**
 * @author: lijunlong
 * @CreateDate: 2018/4/24
 * @Desc :
 */
public class MultiplyTest {
    @Test
    public void test_01(){
        Double a = Math.random();
        Double b = Math.random();
        Double c = Math.random();
        String message = String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c);
        Assert.assertEquals(message,
                Multiply.multiply(Multiply.multiply(a, b), c),
                Multiply.multiply(a, Multiply.multiply(b, c)),
                1E-14);
    }
}
