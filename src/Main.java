public class Main {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);

        ListNode test = new ListNode();

        addNode(node1, node2);
        addNode(node1, node3);

        printList(node1);
        Solution obj = new Solution();
        node1 = obj.rotateRight(node1, 4);

        printList(node1);


    }
    public static void addNode(ListNode head, ListNode newNode) {
        ListNode last = head;

        if (head == null) {
            head.next = newNode;
        }
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}