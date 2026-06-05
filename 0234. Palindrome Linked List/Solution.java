// 0234. Palindrome Linked List
// Difficulty : Easy
// Runtime    : 3 ms
// Memory     : 94.3 MB
// URL        : https://leetcode.com/problems/palindrome-linked-list/

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
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode previous = null;

        while(slow!=null){
            ListNode nextNode = slow.next;
            slow.next = previous;
            previous = slow;
            slow = nextNode;
        }

        while(previous != null){
            if(head.val != previous.val){
                return false;
            }

            head = head.next;
            previous = previous.next;

        }

        return true;
    }
}