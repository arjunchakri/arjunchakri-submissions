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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalNode = new ListNode(0);
        ListNode result = finalNode;
        int carry = 0, value;
        while(l1 != null || l2 != null) {
            value = 0;
            if(l1 != null) {
                value += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                value += l2.val;
                l2 = l2.next;
            }
            value += carry;
            if(value >= 10) {
                carry = 1;
                value = value % 10;
            } else {
                carry = 0;
            }
            result.next = new ListNode(value);
            result = result.next;

        }
        if(carry == 1) {
            result.next = new ListNode(carry);
        }
        return finalNode.next;
    }
}