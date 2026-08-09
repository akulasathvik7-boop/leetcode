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
         int mul=1;
        int sum=0;
    public int getDecimalValue(ListNode head) {
       
        if(head.next==null){
            return mul*head.val;
        }

        int sum=getDecimalValue(head.next);
        mul*=2;
        sum+=mul*head.val;

    return sum;
    }
}