import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    /**
     * 采用交换法来实现分区，再进行递归
     * @param sourArray 待排序的数组
     * @param left 数组下界
     * @param right 数组上界
     * @return 分割的中枢轴下标
     * */
    public static int partion(int[] sourArray,int left,int right){
        // 选取数组第一个元素作为枢轴元素
        int pivot = sourArray[left];
        int i = left + 1;
        int j = right;
        //如何确定这个循环条件？ 要交换 i 和 j 那 j 必须大于 i 相等不用交换
        while (i < j) {
            // 只要 i 不大于 j 就挨着找右边满足条件的元素。不能因为 i = j 而漏找 造成错误。
            while (sourArray[j] >= pivot && j >= i) {
                j--;
            }
            //同上
            while (sourArray[i] < pivot && i <= j) {
                i++;
            }
            //只有 i 小于 j 时候才交换
            if (i < j) {
                swap(sourArray, i, j);
                System.out.println("交换数据：" + Arrays.toString(sourArray));
            }
        }
        //每一趟交换完毕都要把 pivot 元素放到目标位置，极端情况是 pivot 在正确位置那就原地交换
        swap(sourArray, left, j);
        return j;
    }

    public static void swap(int[] arrayData, int i,int j){
        int temp = arrayData[j];
        arrayData[j] = arrayData[i];
        arrayData[i] = temp;
    }

    /**/
    public static int[] quicksort(int[] sourceArray,int left,int right){
        if (left >= right){
            return null;
        }
        //递归处理两边元素
        int pivot = partion(sourceArray,left,right);
        quicksort(sourceArray,left,pivot - 1);
        quicksort(sourceArray,pivot + 1,right);
        return sourceArray;
    }

    public static void main(String[] args){
        int[] source = {4,1,2,5,3,7,6};
        int[] newArray = quicksort(source,0,6);
        System.out.println(Arrays.toString(newArray));
    }
}
