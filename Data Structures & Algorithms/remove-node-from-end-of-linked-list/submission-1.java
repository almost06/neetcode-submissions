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
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            var temp = cur.next; 
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        if(n == 1){
            prev = prev.next;
        }else{
            int count = 0; 
            cur = prev;
            while(count < n-2){
                cur = cur.next;
                count++;
            }
            cur.next = cur.next.next;
        }

        cur = prev;
        ListNode r = null;
        while(cur != null){
            var temp = cur.next; 
            cur.next = r;
            r = cur;
            cur = temp;
        }

        return r;
    }
}
