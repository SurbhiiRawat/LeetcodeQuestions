/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newL = new ListNode(-1);
        ListNode curr = newL;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                curr.next = p1;
                curr = p1;
                p1 = p1.next;
            } else {
                curr.next = p2;
                curr = p2;
                p2 = p2.next;
            }

        }
        if (p1 != null) {
            curr.next = p1;
        }
        if (p2 != null) {
            curr.next = p2;
        }
        return newL.next;

    }
}