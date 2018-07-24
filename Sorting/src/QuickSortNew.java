package src;

import java.util.Arrays;

/**
 * Created by qingliu on 7/13/18.
 */
public class QuickSortNew {
    public static void main(String[] args){
        int[] a = { 4, 1, 9, 7, 8, 3, 6, 5};
        quickSort(a,0,7);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] num, int left, int right)
    {
        if (num == null) return; //如果左边大于右边，则return，这里是递归的终点，需要写在前面。
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int temp = num[i]; //此处开始进入遍历循环
        while (i < j) { //从右往左循环
            while (i < j && num[j] >= temp) {//如果num[j]大于temp值，则pass，比较下一个
                j--;
            }
            num[i] = num[j];
            while (i < j && num[i] <= temp) {
                i++;
            }
            num[j] = num[i];
            num[i] = temp; // 此处不可遗漏，将基准值插入到指定位置
        }
        quickSort(num, left, i - 1);
        quickSort(num, i + 1, right);
    }
}
