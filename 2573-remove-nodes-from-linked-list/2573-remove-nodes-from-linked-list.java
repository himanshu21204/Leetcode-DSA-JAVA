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
    public ListNode removeNodes(ListNode head) {
        ListNode rev = reverseList(head);
        ListNode max = rev;
        ListNode temp = rev;

        while(temp.next!=null){
            temp=temp.next;
            if(max.val<=temp.val){
                max.next=temp;
                max=temp;
            }
        }
        if(max.next!=null)max.next=null;
        return reverseList(rev);
    }
    public ListNode reverseList(ListNode head) {
        if (head==null) return null;
        ListNode past=null;
        ListNode present=head;
        ListNode future =head.next;

        while(present != null){
            present.next=past;
            past=present;
            present=future;
            if(future != null) future=future.next;
        }
        return past;
    }
}