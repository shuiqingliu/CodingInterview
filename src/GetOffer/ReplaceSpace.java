package com.company;

/**
 * Created by qingliu on 2/27/18.
 */

/*
* 面试题5：替换空格
* 题目：请实现一个函数，把字符串中的每个空格替换成"%20"。例如输入“We are happy.”，
* 则输出“We%20are%20happy.”。
**/

public class ReplaceSpace {

    public static void main(String args[]){
        String testData = "Hello World! #$#$!!@!@";
        char[] test = new char[testData.length() + 4];
        char[] testDataArray = testData.toCharArray();
        for (int i = 0; i < testDataArray.length; i++){
            test[i] = testDataArray[i];
        }
        replace(test,testData.length(),testData.length() + 4);
    }

    public static void replace(char[] testStr,int strLength,int storeLength){

        if (testStr == null || testStr.length == 0){
            return;
        }

        int length = strLength;
        int numberOfBlank = 0; //空格计数
        for (int i = 0; i < strLength; i++){
            if (testStr[i] == ' '){
                numberOfBlank++;
            }
        }

        int newStrLength = length + numberOfBlank*2;
        if (newStrLength > storeLength){ //若给定空间不够存储则直接返回
            return;
        }

        int indexOfOriginal = length - 1;
        int indexOfNew = newStrLength -1;
        while (indexOfOriginal >=0 && indexOfNew > indexOfOriginal){
            if (testStr[indexOfOriginal] == ' '){  //若前面指针已经找到空格则后面的指针开始填充
                testStr[indexOfNew--] = '0';
                testStr[indexOfNew--] = '2';
                testStr[indexOfNew--] = '%';
            }
            else {
                testStr[indexOfNew--] = testStr[indexOfOriginal]; //若没找到则将前面指针的值拷贝到后面指针存储
            }

            indexOfOriginal--;
        }

        String result = String.valueOf(testStr);
        System.out.println(result);
    }
}
