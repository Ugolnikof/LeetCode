import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LongestCommonPrefixTest {
    private final LongestCommonPrefix prefix = new LongestCommonPrefix();

    @Test
    public void case1() {
        String[] strs = new String[]{"flower","flow","flight"};
        assertEquals("fl", prefix.longestCommonPrefix(strs));
    }

    @Test
    public void case2() {
        String[] strs = new String[]{"dog","racecar","car"};
        assertEquals("", prefix.longestCommonPrefix(strs));
    }

    @Test
    public void case3() {
        String[] strs = new String[]{"cir","car"};
        assertEquals("c", prefix.longestCommonPrefix(strs));
    }
}