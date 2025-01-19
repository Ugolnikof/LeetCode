import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortTest {

    @Test
    public void radixSortFullArray() {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;
        String actual = RadixSort.toString(RadixSort.radixSort(arr, n));
        String expected = "2 24 45 66 75 90 170 802";
        assertEquals(expected, actual);
    }

    @Test
    public void radixSortOneElementArray() {
        int[] arr = {170};
        int n = arr.length;
        String actual = RadixSort.toString(RadixSort.radixSort(arr, n));
        String expected = "170";
        assertEquals(expected, actual);
    }

    @Test
    public void radixSortEmptyArray() {
        int[] arr = new int[]{};
        int n = arr.length;
        String actual = RadixSort.toString(RadixSort.radixSort(arr, n));
        String expected = "";
        assertEquals(expected, actual);
    }
}