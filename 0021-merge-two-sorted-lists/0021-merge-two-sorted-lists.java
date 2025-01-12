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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode head = ans;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                head.next = new ListNode(list1.val);
                head = head.next;
                list1 = list1.next;
            }else{
                head.next = new ListNode(list2.val);
                head = head.next;
                list2 = list2.next;
            }
            
        }
        if(list1 != null){
            head.next = list1;
        }
        if(list2 != null){
            head.next = list2;
        }
        // while(list1 != null){
        //     head.next = new ListNode(list1.val);
        //     head = head.next;
        //     list1 = list1.next;
        // }
        // while(list2 != null){
        //     head.next = new ListNode(list2.val);
        //     head = head.next;
        //     list2 = list2.next;
        // }
        return ans.next;
    }
}

