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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode prev=null;
       ListNode curr=head;
       int count=0;
       while(curr!=null){
        curr=curr.next;
        count++;
       }
    System.out.println(count);
     int n1= count-n;
     curr=head;

     if(n1==0) return head.next;
     
     while(n1>0 ){
        prev=curr;
        curr=curr.next;
        n1--;

     }
     prev.next= curr.next;

     return head;
    }
}
