/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node dummy = new Node(-1);
        Node temp = dummy;
        for(Node curr = head; curr != null ; curr = curr.next){
            Node node = new Node(curr.val);
            temp.next = node;
            temp = node;
            map.put(curr, node);
        }
        for(Node curr = head; curr != null; curr=curr.next){
            Node copy = map.get(curr);
            if(curr.random != null){
                copy.random = map.get(curr.random);
            }else{
                copy.random = null;
            }
        }
        return dummy.next;
    }
}