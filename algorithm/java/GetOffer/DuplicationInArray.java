package GetOffer;

/**
 * Created by qingliu on 2/27/18.
 */

// 面试题3（一）：找出数组中重复的数字
// 题目：在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
// 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。例如，如果输入长度为7的数组{2, 3, 1, 0, 2, 5, 3}，
// 那么对应的输出是重复的数字2或者3。

public class DuplicationInArray {
    public static void main(String args[]){
        int a[] = {};
        duplicate(a);
    }

    public static boolean duplicate(int[] numbers){
        //判断是否为空和长度是否为 0
        if (numbers == null || numbers.length <= 0){
            return false;
        }

        //数组每个值要符合 0~n-1
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0 || numbers[i] > numbers.length -1){
                return false;
            }
        }

        for (int i = 0; i < numbers.length; i++){
            while (numbers[i] != i){
                //如果当前位置的值定于以该值为下标处的值则找到了重复的
                if (numbers[i] == numbers[numbers[i]]){
                    System.out.println("找到的其中一个值为：" +  numbers[i]);
                    return true;
                }

                //若不等于则交互两个位置的值，这样数组下标值就等于当前存储的值
                int tempNumber = numbers[i];
                numbers[i] =  numbers[tempNumber];
                numbers[tempNumber] =  tempNumber;

            }
        }
        System.out.println("没有找到任何一个重复数字");
        return  false;
    }
}
