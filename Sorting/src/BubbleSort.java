package src;

import java.util.Arrays;

/**
 * Created by qingliu on 7/31/18.
 *
 * Description:
 * BubbleSort 平均复杂度 O(n^2);
 *
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] testArray = {4,3,5,6,1,2,8,7};
        bubbleSort(testArray,8);
        System.out.println(Arrays.toString(testArray));
    }

    public static void bubbleSort(int[] arr,int n){
        for (int i = 0; i < n - 1; i++){
            for (int j = 1; j < n - i; j++){
                if (arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
