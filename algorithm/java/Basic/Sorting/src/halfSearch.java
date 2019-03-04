/**
 * Created by qingliu on 7/13/18.
 */
public class halfSearch {
    private static int search(int[] a,int target){
        int i = 0;
        int j = a.length - 1;
        while (i <= j){
            int mid = (i + j)/2;
            int minValue = a[mid];
            if (target < minValue){
                j = mid - 1;
            }else if (target > minValue){
                i = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(a,3));
    }
}
