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
        ListNode nodeS = head;
        ListNode nodeE = head;
        int n = k;

        while(n-- > 1){
            nodeS = nodeS.next;
        }

        int count = countNode(head);
        n = count - k;
        while(n-- > 0){
            nodeE = nodeE.next;
        }

        int temp = nodeS.val;
        nodeS.val = nodeE.val;
        nodeE.val = temp;
        return head;
    }
    int countNode(ListNode temp){
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}