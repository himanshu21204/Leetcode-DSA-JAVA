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
        Node node = head;
        HashMap<Node,Node> list = new HashMap<>();

        while(node != null){
            list.put(node, new Node(node.val));
            node = node.next;
        }
        node = head;
        while(node != null){
            list.get(node).next = list.get(node.next);
            list.get(node).random = list.get(node.random);
            node = node.next;
        }
        return list.get(head);
    }
}