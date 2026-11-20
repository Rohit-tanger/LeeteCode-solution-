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
          if (head == null || head.next == null) {
            return head;
        }
         ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even!=null && even.next!=null ){
            // odd se shuru hoga to yaha se start karo
            odd.next = even.next;
            odd =odd.next;

            even.next = odd.next;
            even =even.next;

        }
        odd.next = evenHead; // link banane ke liye odd aur even wale men
        return head;
    }
}