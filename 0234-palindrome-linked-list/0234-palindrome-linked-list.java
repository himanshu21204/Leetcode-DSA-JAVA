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
        if(head==null || head.next==null) return true;
        int len = 0;
        ListNode node = head;
        while(node != null){
            len++;
            node = node.next;
        }
        ListNode temp = head;
        len = len/2;
        while(len-- > 0){
            temp = temp.next;
        }
        ListNode rev = rev(temp,null);
        temp = head;

        while(temp != null && rev != null){
            if(temp.val != rev.val){
                return false;
            }
            temp = temp.next;
            rev = rev.next;
        }
        return true;
    }
    public ListNode rev(ListNode node, ListNode pre) {
        if (node == null) return pre;
        ListNode temp = node.next;
        node.next = pre;
        return rev(temp, node);
    }
}