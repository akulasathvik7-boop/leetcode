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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)return head;
       ListNode curr=head;
       ListNode evenhead=head.next;
       ListNode curr1=head.next;
       while((curr!=null&&curr.next!=null)&&(curr1!=null&&curr1.next!=null)){
        curr.next=curr.next.next;
        curr1.next=curr1.next.next;

        curr=curr.next;
        curr1=curr1.next;        
       }
       curr.next=evenhead;

    return head;

    }
}