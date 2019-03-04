import java.util.PriorityQueue;

/**
 * Created by qingliu on 8/8/18.
 */
public class Median {

    public static void main(String[] args){
        int[] test = {4,5,21,7,2,9,8,10};
        double medianNumber = median(test);
        System.out.println(medianNumber);
    }

    public static double median(int[] arr){
        int heapSize = arr.length / 2 + 1;
        PriorityQueue<Integer> smallHeap = new PriorityQueue<>(heapSize);

        //add number of the half of arr
        for (int i = 0; i < heapSize; i++){
            smallHeap.add(arr[i]);
        }

        //create Minimum heap
        for (int j = heapSize; j < arr.length; j++){
            if (smallHeap.peek() < arr[j]){
                smallHeap.poll();
                smallHeap.add(arr[j]);
            }
        }

        if (arr.length % 2 == 1){
            return (double)smallHeap.peek();
        }else {
            return (double)(smallHeap.poll() + smallHeap.peek()) / 2;
        }
    }
}
