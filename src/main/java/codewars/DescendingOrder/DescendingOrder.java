package codewars.DescendingOrder;

/**
 * @author: lijunlong
 * @CreateDate: 2018/4/20
 * @Desc :
 */
public class DescendingOrder {
    public static int sortDesc(final int num){
        int result = 0;
        char[] splitedInt = String.valueOf(num).toCharArray();
        char[] sorted = insertionSort(splitedInt);
        result = Integer.parseInt(String.valueOf(sorted));
        return result;
    }

    public static char[] insertionSort(char[] chars){
        for (int i = 1; i < chars.length; i++){
            char temp = chars[i];
            int j = i - 1;
            for (;j >= 0 && chars[j] < temp; j--){
                chars[j + 1] = chars[j];
            }
            chars[j + 1] = temp;
        }
        return chars;
    }
    public static void main(String args[]){
        int desc = sortDesc(456987268);
        System.out.println(desc);
    }
}
