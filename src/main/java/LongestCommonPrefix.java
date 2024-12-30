public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // looking for the shortest string in the array
        String shortStr = strs[0];
        for (String str : strs) {
            if (str.length() < shortStr.length()) {
                shortStr = str;
            }
        }

        // looking for a prefix
        String prefix = "";
        for(int i = 0; i < shortStr.length(); i++) {
            int j = 0; // creating a counter
            for (String str : strs) {
                if (str.charAt(i) == shortStr.charAt(i)) {
                    j++;
                }
            }
            if (j == strs.length) {
                prefix += shortStr.charAt(i);
            } else {
                break;
            }
        }
        return prefix;
    }
}
