class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class Main {
    // Convert an array into a linked list
    public static Node buildList(int[] arr) {
        if (arr.length == 0)
            return null;
        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public static Node remove_key(Node head, int key) {
        // 1. Remove leading matching nodes
        while (head != null && head.data == key) {
            head = head.next;
        }

        // 2. Remove matching nodes from the rest of the list
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (curr.data == key) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }

    // Print the linked list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // removeDuplicates code
    public static Node removeDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    // get the length of linked list
    public static int get_length(Node head) {
        int l = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            l++;
        }
        return l + 1;
    }

    // get the middle element of the linkedList
    public static int get_middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    // critical points code
    public static int critical_points(Node head) {
        if (head == null || head.next == null || head.next.next == null)
            return 0;
        int count = 0;
        Node prev = head;
        Node curr = head.next;
        while (curr.next != null) {
            if (curr.data > prev.data && curr.data > curr.next.data) {
                count++;
            } else if (curr.data < prev.data && curr.data < curr.next.data) {
                count++;
            }
            prev = curr;
            curr = curr.next;
        }
        return count;
    }

    // cyclic code leet code medium
    public static Node cyclic_meet(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] input = { 1, 1, 6, 8, 8 };
        Node head = buildList(input);
        System.out.print("Original: ");
        printList(head);
        head = removeDuplicates(head);
        System.out.print("Result:   ");
        printList(head);
    }
}
