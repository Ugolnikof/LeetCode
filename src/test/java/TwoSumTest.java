import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {
    private final TwoSum s = new TwoSum();

    @Test
    public void nullList() {}


    @Test
    public void emptyList() {
        int[] actual = s.twoSumSolution(new int[]{}, 9);
        assertEquals("[]", Arrays.toString(actual));
    }


    @Test
    public void fourElements() {
        int[] actual = s.twoSumSolution(new int[]{2,7,11,15}, 9);
        assertEquals("[0, 1]", Arrays.toString(actual));
    }

    @Test
    public void threeElements() {
        int[] actual = s.twoSumSolution(new int[]{3, 2, 4}, 6);
        assertEquals("[1, 2]", Arrays.toString(actual));
    }

    @Test
    public void twoElements() {
        int[] actual = s.twoSumSolution(new int[]{3, 3}, 6);
        assertEquals("[0, 1]", Arrays.toString(actual));
    }

}