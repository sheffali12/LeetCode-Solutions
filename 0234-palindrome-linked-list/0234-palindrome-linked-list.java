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
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode present = head;

        while (present != null) {
            ListNode next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reverseHead = headSecond; // save to restore later

        ListNode p1 = head;
        ListNode p2 = headSecond;
        boolean result = true;

        while (p2 != null) {
            if (p1.val != p2.val) {
                result = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        reverseList(reverseHead); // restore original list (optional)
        return result;
    }
}