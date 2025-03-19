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
    public ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode head1= l1;
        ListNode head2 = l2;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                head1.next = temp;
                head1 = temp;
            }else{
                head2.next = temp;
                head2 = temp;
            }
            temp = temp.next;
        }
        head2.next = null;
        head1.next = l2.next;
        return l1.next;
    }
}