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
    public ListNode doubleIt(ListNode head) {
        ListNode l2 = reverse(head);
        ListNode newL = l2;
        int carry = 0;
        ListNode rev = new ListNode(-1);
        ListNode rev2 = rev;
        while (newL != null) {
            int sum = carry;

            sum += newL.val * 2;
            newL = newL.next;

            ListNode newNode = new ListNode(sum % 10);
            rev2.next = newNode;
            carry = sum / 10;
            rev2 = rev2.next;
        }
        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            rev2.next = newNode;
        }
        return reverse(rev.next);

    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}