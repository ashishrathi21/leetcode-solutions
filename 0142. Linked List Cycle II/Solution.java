// 0142. Linked List Cycle II
// Difficulty : Medium
// Runtime    : 0 ms
// Memory     : 46.5 MB
// URL        : https://leetcode.com/problems/linked-list-cycle-ii/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                
                ListNode ptr = head;

                while(ptr != slow){
                    ptr = ptr.next;
                    slow = slow.next;
                }

                return ptr; 
            }
        }

        return null; 
    }
}