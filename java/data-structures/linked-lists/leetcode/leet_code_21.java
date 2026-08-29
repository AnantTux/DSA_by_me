class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class leet_code_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Example: list1 = [1, 2, 4], list2 = [1, 3, 4] -> Output: [1, 1, 2, 3, 4, 4]
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        leet_code_21 solution = new leet_code_21();
        ListNode result = solution.mergeTwoLists(list1, list2);

        // Print result
        while (result != null) {
            System.out.print(result.val + (result.next != null ? " -> " : ""));
            result = result.next;
        }
        System.out.println();
    }
}
