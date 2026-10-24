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
        Set<ListNode> checked = new HashSet<ListNode>();
        while (head != null){
            if (!checked.contains(head)){
                checked.add(head);
            } else {
                return true;
            }
            head = head.next; 
        } 
        return false;
    }
}
