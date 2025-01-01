public class AddTwoNumbers {

//    Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // создание фиктивной (dummy) ноды для возврата
        ListNode dummy = new ListNode(0, null);
        // установка указателя текущей (curr) ноды на dummy
        ListNode curr = dummy;
        // инициализация переменной carry для хранения "переноса" в следующий разряд
        int carry = 0;
        // цикл, который будет выполняться до тех пор, пока l1 или l2 содержат ноды или есть остаток от прошлого разряда (carry)
        while (l1 != null || l2 != null || carry != 0) {
            // инициализация переменной sum как текущей суммы
            int sum = carry;
            // если l1 не равно null, то добавляем его значение в sum и перемещаемся на следующий узел
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            // если l2 не равно null, то добавляем его значение в sum и перемещаемся на следующий узел
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            // вычисляем carry для следующей итерации
            carry = sum / 10;
            // создание новой ноды с результатом текущей суммы в текущем разряде
            curr.next = new ListNode(sum % 10, null);
            // перемещаем указатель на следующую ноду
            curr = curr.next;
        }
        // возврат ноды, следующей за фиктивной нодой (dummy)
        return dummy.next;
    }

    public static String printListNode(ListNode l) {
        String result = "";
        do {
            result += l.val;
            l = l.next;
        }
        while (l != null);
        return result;
    }

}
