import org.junit.Test;
import org.junit.Assert;

/**
 * @author: lijunlong
 * @CreateDate: 2018/4/20
 * @Desc :
 */
public class DescendingOrderTest {

    @Test
    public void test_01(){
        Assert.assertEquals(0,DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02(){
        Assert.assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test_03(){
        Assert.assertEquals(987654321,DescendingOrder.sortDesc(123456789));
    }

}
