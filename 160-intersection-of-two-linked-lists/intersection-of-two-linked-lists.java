/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
           while (headA != null) {
            ListNode hB = headB;

            while (hB != null) {

                if (headA == hB) {
                    return headA; // intersection found
                }

                hB = hB.next; // move through listB
            }

            headA = headA.next; // move through listA
        }

        return null; 
    }
}