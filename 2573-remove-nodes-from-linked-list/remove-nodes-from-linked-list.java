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
    public ListNode removeNodes(ListNode head) {

        // Reverse linked list
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }


        head = prev;
        curr = head;

        // Remove smaller nodes
        ListNode max = curr;

        while (curr != null) {

            curr = curr.next;

            while (curr != null && curr.val < max.val) {
                curr = curr.next;
            }

            max.next = curr;

            max = curr;
        }


        // Reverse again to restore order
        prev = null;
        curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }


        return prev;
    }
}