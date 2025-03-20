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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode t1= head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newList = reverse(slow);
        ListNode t2= newList;
        while(t2 != null){
            if(t1.val != t2.val){
                return false;
            }
            t1= t1.next;
            t2= t2.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!= null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        return prev;
        
    }
}