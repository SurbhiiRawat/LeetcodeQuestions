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
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null || head.next == null) return head;
        int count = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp= temp.next;
            count++;
        }
        temp.next = head;
        k = k%count;
        k= count-k;
        while(k!=0){
            temp = temp.next;
            k--;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}