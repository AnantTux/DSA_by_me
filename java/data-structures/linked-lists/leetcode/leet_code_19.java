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

public class leet_code_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = 0;

        while (curr != null) {
            curr = curr.next;
            length++;
        }

        if (length == n) {
            return head.next;
        }

        curr = head;
        for (int i = 0; i < length - n - 1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        // Example: head = [1, 2, 3, 4, 5], n = 2 -> Output: [1, 2, 3, 5]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;

        leet_code_19 solution = new leet_code_19();
        ListNode result = solution.removeNthFromEnd(head, n);

        // Print result
        while (result != null) {
            System.out.print(result.val + (result.next != null ? " -> " : ""));
            result = result.next;
        }
        System.out.println();
    }
}
