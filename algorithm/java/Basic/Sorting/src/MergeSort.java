import java.util.Arrays;

/**
 * Created by qingliu on 8/6/18.
 */
public class MergeSort {

    public static void main(String[] args){
        int[] b = {411,575,686,364,887,183};
        mergeSort(b,0,b.length - 1);
        System.out.println(Arrays.toString(b));
    }

    public static void mergeSort(int[] arr,int l,int r){
        if (arr == null || r < l){
            return;
        }

        if (l < r){
            int mid = (l + r) / 2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid + 1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void merge(int[] arr,int l,int m,int r){
        int i = l;
        int j = m + 1;
        int tempArrayLength = (r - l) + 1;
        int[] tempArray = new int[tempArrayLength];
        int k = 0;
        while (i <= m && j <= r){
            if (arr[i] <= arr[j]){
                tempArray[k] = arr[i];
                i++;
            }else {
                tempArray[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= m){
            tempArray[k] = arr[i];
            i++;
            k++;
        }

        while (j <= r){
            tempArray[k] = arr[j];
            j++;
            k++;
        }

        for(int index = 0; index < tempArray.length; index++){
            arr[index + l] = tempArray[index];
        }
    }
}
