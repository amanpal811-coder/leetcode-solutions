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

    public int length(ListNode head){
        ListNode temp = head;
        int count  = 0;
        while(head != null){
            head = head.next;
            count++;
        }
         temp = head;
        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        // int n = length(head);
        k = k%length(head);
        if(k == 0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1; i <= k+1;i++){
            fast = fast.next;
        } 

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        ListNode a = slow.next;
        slow.next = null;
        ListNode temp = a;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return a;

    }
}