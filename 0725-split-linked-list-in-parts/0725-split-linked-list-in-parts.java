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
    public ListNode[] splitListToParts(ListNode head, int k) {
        if(head == null) return new ListNode[k];
        int count = count(head);
        ListNode[] ans = new ListNode[k];

        int rem = count % k;
        int div = count / k;
        ListNode cur = head;

        for(int i=0;i<k;i++){
            ListNode node = new ListNode(0);
            ListNode fun = node;
            for(int j=0;j<(div + (i<rem ? 1:0));j++){
                fun.next = new ListNode(cur.val);
                fun = fun.next; 
                if(cur != null) cur = cur.next;
            }
            ans[i] = node.next;
        }
        return ans;
    }
    int count(ListNode temp){
        int count = 1;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}