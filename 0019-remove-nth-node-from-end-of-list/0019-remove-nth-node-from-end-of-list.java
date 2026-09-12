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
        if(head==null){
            return head;
        }
        //to find length of linked list
        int len=0;
        ListNode ptr=head;
        while(ptr!=null){
            len++;
            ptr=ptr.next;
        }
    
        int cnt=0;
        //two pointers
        ListNode ptr1=head;
        ListNode ptr2=head;
        
        while(ptr1.next!=null && cnt<(len-n)){
            cnt++;
            ptr2=ptr1;
            ptr1=ptr1.next;
            }
            if(len==n){
             head=head.next;
            }
            else if(n==1){
                ptr2.next=null;
            }
            else{
            ptr2.next=ptr1.next;
            ptr1.next=null;
            }
        return head;
        }
}