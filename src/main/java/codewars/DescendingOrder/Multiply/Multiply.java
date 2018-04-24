package codewars.DescendingOrder.Multiply;

/**
 * @author: lijunlong
 * @CreateDate: 2018/4/24
 * @Desc :
 */
public class Multiply {
    public static Double multiply(Double a, Double b) {
        Double sum,carry;
        if (b == 0.0){
            System.out.println(a);
            return a;
        }
        sum =Double.longBitsToDouble(Double.doubleToRawLongBits(a) ^ Double.doubleToRawLongBits(b));
        carry = Double.longBitsToDouble((Double.doubleToRawLongBits(a) & Double.doubleToRawLongBits(b)) << 1);
        return multiply(sum,carry);
    }
}
