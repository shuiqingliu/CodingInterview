/**
 * Created by qingliu on 8/7/18.
 *
 * Write an algorithm which computes the number of trailing zeros in n factorial.
 *
 * Example
 * 11! = 39916800, so the out should be 2
 *
 * Challenge
 * O(log N) time
 */
public class LintCode_002_Trailing_Zero {

    public static void main(String[] args){
        System.out.println(trailingZeros(13));
    }

    public static long trailingZeros(long n) {
        long sum = 0;
        while (n != 0) {
            sum += n / 5;
            n /= 5;
        }
        return sum;
    }
}
