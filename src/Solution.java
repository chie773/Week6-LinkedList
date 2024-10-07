class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int noItems = 0;
        ListNode current;
        current = head;
        while (current != null) {
            noItems++;
            current = current.next;
        }
        if (noItems == k) {
            return head;
        }
        for (int i = 0; i < k; i++) {

            ListNode temp;
            temp = head;


            if (head == null) {
                return head;
            }

            while (temp != null) {
                if (temp.next.next == null) {
                    temp.next.next = head;
                    head = temp.next;
                    temp.next = null;
                }
                temp = temp.next;
            }
        }
        return head;
    }

}