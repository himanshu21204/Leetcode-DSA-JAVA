/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        ListNode fir = head;
        ListNode sec = head;

        while(length-- > 0){
            sec = sec.next;
        }

        while(sec != fir){
            fir = fir.next;
            sec = sec.next;
        }
        // return sec;
        return fir;
    }
}