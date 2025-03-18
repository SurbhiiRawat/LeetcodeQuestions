/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p =head;
        while(k > 1){
            p = p.next;
            k--;
        }
        ListNode temp = p;
        ListNode ptr = head;
        while(temp.next!= null){
            temp = temp.next;
            ptr = ptr.next;
        }
        int val = p.val;
        p.val = ptr.val;
        ptr.val = val;
        return head;
    }
}