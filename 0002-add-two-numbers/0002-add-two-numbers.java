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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode newL = new ListNode(-1);
        ListNode curr = newL;
        int carry = 0;
        
        while(p1 !=null || p2 != null){
            int sum = carry;
            if(p1 != null){
                sum += p1.val;
                p1=p1.next;
            }
            if(p2 != null){
                sum += p2.val;
                p2= p2.next;
            }
            ListNode newNode = new ListNode(sum%10);
            curr.next = newNode;
            carry = sum/10;
            curr = curr.next;

        }
        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }
        return newL.next;
    }
}