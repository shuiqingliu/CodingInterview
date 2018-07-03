import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest{

    @Test
    public void test_SwapMethod_QuickSort(){
        int[] normal = { 4,2,5,7,8,3,6,1};
        int[] sameArray = { 6,6,6};
        int[] sortedArray = { 1,2,3,4};

        int[] sortedNormal = {1,2,3,4,5,6,7,8};

        Assert.assertArrayEquals(QuickSort.quicksort(normal,0,normal.length -1),sortedNormal);
    }

}
