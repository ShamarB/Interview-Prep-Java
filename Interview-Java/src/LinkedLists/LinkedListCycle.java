package LinkedLists;


public class LinkedListCycle {
	
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
		val = x;
		next = null;
		}
	}
	
	public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(7);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;
		
		LinkedListCycle obj = new LinkedListCycle();
		boolean ans = obj.hasCycle(node1);
		System.out.println(ans);
	}
}
