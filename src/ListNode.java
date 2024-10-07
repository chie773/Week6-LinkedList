public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next) {
     this.val = val;
     this.next = next;
    }

    public void addNode(ListNode head, ListNode newNode) {
        ListNode last = head;

        if (head == null) {
            head.next = newNode;
        }
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

}