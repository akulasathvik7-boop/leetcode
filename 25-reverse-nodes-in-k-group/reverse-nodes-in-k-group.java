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
    ListNode findKthNode(ListNode temp,int size){
        size-=1;
        
        while(temp!=null&&size>0){
            size--;
            temp=temp.next;
        }
        return temp;
    }
    ListNode reverse(ListNode temp){
        ListNode curr=temp;
        ListNode prev=null;
        while(curr!=null){
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null&&head.next==null)return head;
        ListNode temp=head;
        ListNode prevNode=null;
        while(temp!=null){
        ListNode kthNode=findKthNode(temp,k);
        if(kthNode==null){
            if(prevNode!=null)prevNode.next=temp;
            break;
        }
        ListNode nextNode=kthNode.next;
        kthNode.next=null;
        reverse(temp);
        if(head==temp){
            head=kthNode;
        }else{
            prevNode.next=kthNode;
        }
        prevNode=temp;
        temp=nextNode;
    }
    return head;
    }
}