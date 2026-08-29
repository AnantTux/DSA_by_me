class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class leet_code_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Example: l1 = [2, 4, 3], l2 = [5, 6, 4] -> Output: [7, 0, 8]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        leet_code_2 solution = new leet_code_2();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print result
        while (result != null) {
            System.out.print(result.val + (result.next != null ? " -> " : ""));
            result = result.next;
        }
        System.out.println();
    }
}
