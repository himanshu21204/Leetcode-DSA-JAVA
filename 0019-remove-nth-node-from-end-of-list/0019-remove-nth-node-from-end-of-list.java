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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp = head;

        if(head.next==null && n>0) return null;

        while(temp!=null){
            temp=temp.next;
            length++;
        }
        if(length==n) return head.next;
        int skips = length - n ;
        temp=head;

        while(skips-->1){
            temp=temp.next;
        }
        if(temp.next.next != null){
            temp.next=temp.next.next;
        }
        else{
            temp.next=null;
        }

        return head;
    }
}