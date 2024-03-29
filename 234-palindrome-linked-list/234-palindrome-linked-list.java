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
 ListNode ref;
    public boolean isPalindrome(ListNode head) {
         ref = head ; //initial ref points head
        return check(head);
        
    }
    public boolean check(ListNode node){
        if(node == null) {
            return true ;
        }
        Boolean ans = check(node.next);
        Boolean isEqual  = (ref.val == node.val) ? true : false ;
        ref = ref.next ;
        return ans && isEqual ;
    }
}
