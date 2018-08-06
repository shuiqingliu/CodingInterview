package src;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by qingliu on 8/6/18.
 */
public class MergeSortTest {

    @Test
    public void testRight(){
        int[] a = {119,160,390,947,604,251};
        int[] b = {119,160,251,390,604,947};
        MergeSort.mergeSort(a,0,a.length - 1);
        assertArrayEquals(a,b);
    }

    @Test
    public void testIndexError(){
        int[] a = {119,160,390,947,604,251};
        int[] b = {119,160,251,390,604,947};
        MergeSort.mergeSort(a,0,-1);
        assertNotEquals(a,b);
    }

    @Test
    public void testArrayNull(){
        int[] a = null;
        MergeSort.mergeSort(a,0,1);
        assertNull(a);
    }
}
