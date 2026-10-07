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
        if(list1==null && list2==null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1; 

        var cur1 = list1; 
        var cur2 =list2; 
        ListNode cur = null;
        ListNode head = null;
        while(cur1 != null && cur2 != null){ 
            if(cur1.val <= cur2.val){
                if(head == null) {head = cur1;cur = head;}
                else{
                    cur.next = cur1;
                    cur = cur.next;
                }
                cur1 = cur1.next;
            }else{
                if(head == null) {head = cur2;cur = head;}else{
                    cur.next = cur2;
                    cur = cur.next;
                }
                cur2 = cur2.next;
            }
        }


        if(cur1 != null){
            cur.next = cur1;
        }
        if(cur2 != null){
            cur.next = cur2;
        }
        return head;
    }
}