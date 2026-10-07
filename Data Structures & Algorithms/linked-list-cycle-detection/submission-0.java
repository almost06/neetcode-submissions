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
    public boolean hasCycle(ListNode head) {
        var cur1 = head; 
        var cur2 = head;
        while(cur1 != null && cur2 != null){
            cur1 = cur1.next;
            cur2 = cur2.next;
            if(cur2 == null) return false; 
            cur2 = cur2.next;
            if(cur1 == cur2) return true;
        }
        return false;
    }
}
