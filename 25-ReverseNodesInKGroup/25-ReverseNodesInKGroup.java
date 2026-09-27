// Last updated: 9/27/2026, 4:29:42 PM
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;

        // Check if k nodes exist
        for (int i = 0; i < k; i++) {
            if (temp == null)
                return head;
            temp = temp.next;
        }

        // Reverse k nodes
        ListNode prev = null;
        ListNode curr = head;

        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Connect with the next group
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}