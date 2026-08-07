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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stack.add(temp.val);
            temp=temp.next;
        }
        ListNode temp1=head;
        while(temp1!=null){
            if(temp1.val==stack.peek()){
                  temp1=temp1.next;
                stack.pop();
            }else{
                return false;
                            }
        }
        return true;
    }
}