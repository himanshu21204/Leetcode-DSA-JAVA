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
    // public ListNode reverseList(ListNode head) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     ListNode temp = head;
    //     while(temp != null){
    //         list.add(temp.val);
    //         temp = temp.next;
    //     }
    //     ListNode curr = head;
    //     Collections.reverse(list);
    //     for(int num : list){
    //         curr.val = num;
    //         curr = curr.next;
    //     }
    //     return head;
    // }
    public ListNode reverseList(ListNode head) {
        return rev(head, null);
    }

    public ListNode rev(ListNode node, ListNode pre) {
        if (node == null) return pre;
        ListNode temp = node.next;
        node.next = pre;
        return rev(temp, node);
    }
}