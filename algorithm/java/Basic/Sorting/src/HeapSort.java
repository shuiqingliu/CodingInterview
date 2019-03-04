import java.util.Arrays;

/**
 * Created by qingliu on 7/31/18.
 */
public class HeapSort {

    public static void main(String[] args){
        int[] testArray = {3,5,1,4,2,7,6,9,8};
        heapSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void heapSort(int[] arr){
        for (int i = arr.length; i > 0; i--){
            createMaxHeap(arr,i);

            //swap last and first
            int temp = arr[0];
            arr[0] = arr[i - 1];
            arr[i - 1] = temp;
        }

    }

    public static void createMaxHeap(int[] arr,int limit){
        if (arr.length <= 0 || arr.length < limit){
            return;
        }

        int parentIndex = limit / 2;
        for (; parentIndex >= 0; parentIndex--){
            if (parentIndex * 2 >= limit){
                continue;
            }

            int left = parentIndex * 2;
            int right = (left + 1) >= limit ? left:(left +  1);
            int maxChildId = arr[left] > arr[right] ? left:right;

            if (arr[maxChildId] > arr[parentIndex]){
                int temp = arr[parentIndex];
                arr[parentIndex] = arr[maxChildId];
                arr[maxChildId] = temp;
            }
        }

        System.out.println("CreateMaxHeap" + Arrays.toString(arr));
    }
}
