package com.company;

/**
 * Created by qingliu on 2/27/18.
 */

// 面试题4：二维数组中的查找
// 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按
// 照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个
// 整数，判断数组中是否含有该整数。

public class FindNumInMatrix {

    public static void main(String args[]){
        int[][] testData = {{1,2,8,9},{3,6,10,13},{4,5,11,14},{5,8,12,15}};
        int[][] num = new int[4][4];
        boolean result = Found(testData,4,4,5);
        if(result){
            System.out.println("Found it");
        }
        else {
            System.out.println("Not Found");
        }
    }

    public static boolean Found(int[][] data,int rows,int columns,int targetNum){
        boolean found = false;
        if (data != null && rows > 0 && columns > 0){
            int row = 0;
            int column = columns - 1;
            while (row < rows && column >=0){
                if (data[row][column] == targetNum){
                    found = true;
                    break;
                }
                else if (data[row][column] > targetNum){ //右上角元素大于目标数字则剔除所在列
                    column--;
                }
                else {      //否则目标数组大于该数字，行数增加
                    row++;
                }
            }
        }

        return found;
    }
}
