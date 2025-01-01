import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {

    @Test
    public void twoSameLengthNumbers() {
        AddTwoNumbers.ListNode l3 = new AddTwoNumbers.ListNode(3, null);
        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(4, l3);
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2, l2);

        AddTwoNumbers.ListNode m3 = new AddTwoNumbers.ListNode(4, null);
        AddTwoNumbers.ListNode m2 = new AddTwoNumbers.ListNode(6, m3);
        AddTwoNumbers.ListNode m1 = new AddTwoNumbers.ListNode(5, m2);

        AddTwoNumbers.ListNode listNodeResult = AddTwoNumbers.addTwoNumbers(l1, m1);
        String actual = AddTwoNumbers.printListNode(listNodeResult);
        assertEquals("708", actual);
    }

    @Test
    public void twoSameZeroNumbers() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(0, null);

        AddTwoNumbers.ListNode m1 = new AddTwoNumbers.ListNode(0, null);

        AddTwoNumbers.ListNode listNodeResult = AddTwoNumbers.addTwoNumbers(l1, m1);
        String actual = AddTwoNumbers.printListNode(listNodeResult);
        assertEquals("0", actual);
    }

    @Test
    public void twoDifferentLengthNumbers() {
        AddTwoNumbers.ListNode l7 = new AddTwoNumbers.ListNode(9, null);
        AddTwoNumbers.ListNode l6 = new AddTwoNumbers.ListNode(9, l7);
        AddTwoNumbers.ListNode l5 = new AddTwoNumbers.ListNode(9, l6);
        AddTwoNumbers.ListNode l4 = new AddTwoNumbers.ListNode(9, l5);
        AddTwoNumbers.ListNode l3 = new AddTwoNumbers.ListNode(9, l4);
        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(9, l3);
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(9, l2);

        AddTwoNumbers.ListNode m4 = new AddTwoNumbers.ListNode(9, null);
        AddTwoNumbers.ListNode m3 = new AddTwoNumbers.ListNode(9, m4);
        AddTwoNumbers.ListNode m2 = new AddTwoNumbers.ListNode(9, m3);
        AddTwoNumbers.ListNode m1 = new AddTwoNumbers.ListNode(9, m2);

        AddTwoNumbers.ListNode listNodeResult = AddTwoNumbers.addTwoNumbers(l1, m1);
        String actual = AddTwoNumbers.printListNode(listNodeResult);
        assertEquals("89990001", actual);
    }

}