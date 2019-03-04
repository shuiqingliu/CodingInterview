/**
 * Created by qingliu on 8/9/18.
 *
 * 3. Digit Counts
 * Count the number of k's between 0 and n. k can be 0 - 9.
 *
 * Example
 * if n = 12, k = 1 in
 *
 * [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
 * we have FIVE 1's (1, 10, 11, 12)
 */
public class LintCode_003_Digit_counts {

    public static void main(String[] args){
        digitCounts(1,1);
    }

    public static int digitCounts(int k, int n){
        int result = 0;
        for (int i = 0; i < n + 1; i++){
            char[] chars = String.valueOf(i).toCharArray();
            for(int j = 0; j < chars.length; j++){
                if ( String.valueOf(k).toCharArray()[0] == (chars[j])){
                    result++;
                }
            }
        }
        return result;
    }
}
