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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // int i = a;
        // ListNode temp = list1;
        // while(i > 1){
        //     temp = temp.next;
        //     i--;
        // }
        // ListNode start = temp;
        // ListNode node = list2;
        // while(node.next != null){
        //     node = node.next;
        // }
        // while(a<=b){
        //     start = start.next;
        //     a++;
        // }
        // temp.next = list2;
        // node.next = start.next;
        // return list1;
        ListNode start = list1;
        ListNode end = list1;
        int i = 1;
        while(i<=b){
            
            if(i==a) start=end;
            i++;
            end=end.next;
        }
        start.next=list2;
       while(list2.next!=null) list2=list2.next;
       list2.next=end.next;
       return list1;
    }
}