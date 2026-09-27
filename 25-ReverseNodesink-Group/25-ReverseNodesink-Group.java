// Last updated: 9/27/2026, 4:23:44 PM
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3        ListNode temp = head;
4
5        // Check if k nodes exist
6        for (int i = 0; i < k; i++) {
7            if (temp == null)
8                return head;
9            temp = temp.next;
10        }
11
12        // Reverse k nodes
13        ListNode prev = null;
14        ListNode curr = head;
15
16        for (int i = 0; i < k; i++) {
17            ListNode next = curr.next;
18            curr.next = prev;
19            prev = curr;
20            curr = next;
21        }
22
23        // Connect with the next group
24        head.next = reverseKGroup(curr, k);
25
26        return prev;
27    }
28}