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
        if (list1 == null) {return list2;}
        if (list2 == null) {return list1;}

        ListNode prev = list1;
        ListNode newHead = list1;
        if (list1.val > list2.val){
            prev = list2;
            newHead = list2;
            list2 = list2.next;
        } else {
            list1 = list1.next;
        }

        while (list1 != null || list2 != null){
            
            if (list1 == null){
                prev.next = list2;
                break;

            } else if (list2 == null){
                prev.next = list1;
                break;

            } else if (list1.val < list2.val){
                prev.next = list1;
                list1 = list1.next;
                prev = prev.next;

            } else{
                prev.next = list2;
                list2 = list2.next;
                prev = prev.next;

            }
            
            
        
            
        }

        return newHead;
    }
}