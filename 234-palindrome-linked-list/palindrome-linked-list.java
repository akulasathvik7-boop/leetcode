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

    public static ListNode find_middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        // head.next=null;
        head=prev;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
       if(head ==null&&head.next==null)return true;
       ListNode start1=head;
       ListNode middle=find_middle(head);
       ListNode start2=reverse(middle.next);

       while(start2!=null){
        if(start1.val!=start2.val)return false;

        start1=start1.next;
        start2=start2.next;
       }
       return true;
    }
}