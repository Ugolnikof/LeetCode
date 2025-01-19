import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void checkStringIsValid() {
        String str1 = "";
        String str2 = "()";
        String str3 = "()[]{}";
        String str4 = "([{}])";

        assertTrue(ValidParentheses.isValid(str1));
        assertTrue(ValidParentheses.isValid(str2));
        assertTrue(ValidParentheses.isValid(str3));
        assertTrue(ValidParentheses.isValid(str4));
    }

    @Test
    public void checkStringIsNotValid() {
        String str1 = "(]";
        String str2 = "([]";
        String str3 = "(";
        String str4 = "]";
        String str5 = "][";
        String str6 = "]()";

        assertFalse(ValidParentheses.isValid(str1));
        assertFalse(ValidParentheses.isValid(str2));
        assertFalse(ValidParentheses.isValid(str3));
        assertFalse(ValidParentheses.isValid(str4));
        assertFalse(ValidParentheses.isValid(str5));
        assertFalse(ValidParentheses.isValid(str6));
    }

}

