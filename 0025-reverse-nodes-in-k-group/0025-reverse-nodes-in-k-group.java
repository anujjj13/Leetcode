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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode forw=head;
        ListNode curr =head;
        ListNode prev= null;
        int cnt =0;
        while(forw!=null && cnt<k){
            forw=forw.next;
            cnt++;
        }
        if(cnt<k){
            return head;
        }
        for(int i =k;i>0;i--){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;

        }
        head.next=reverseKGroup(curr,k);
        return prev;
    }
}