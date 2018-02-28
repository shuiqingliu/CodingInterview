package com.company;

/**
 * Created by qingliu on 2/27/18.
 */


public class DuplicationInArrayNotEdit {

    public static void main(String args[]){
        int[] data = {2,3,5,4,3,3,6,7};
        getDuplication(data);
    }

    public static int getDuplication(int[] testData){

        if (testData.length <= 0 || testData == null){
            return -1;
        }

        // 划分范围，然后在这个范围内对数组进行计数，如果最终某个数字计数大于 1 则该数字即为重复数字
        int start = 1;
        int end = testData.length -1;
        while (start <= end){
            int middle = (start +  end)/2;
            int count = CountRnage(testData,start,middle);
            if (start == end){
                if (count > 1){
                    System.out.println(start);
                    return start;
                }
                else {
                    break;
                }
            }

            if (count > middle - start + 1){
                end = middle;
            }
            else {
                start = middle + 1;
            }
        }
        return -1;
    }

    //进行给定范围进行计数
    public static int CountRnage(int[] countArray, int start, int end){
        if (countArray ==  null){
            return 0;
        }

        int count = 0;
        for (int i = 0; i < countArray.length; i++){
            if (countArray[i] >= start && countArray[i] <= end){
                count++;
            }
        }
        return count;
    }
}
