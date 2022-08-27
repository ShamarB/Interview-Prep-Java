package LinkedLists;

public class ReverseLinkedList {
	
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
		val = x;
		next = null;
		}
	}
	
	public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
	
	public static void printNodes(ListNode root) {
		ListNode currentNode = root;
		
		System.out.print("Printed List: ");
		
		while (currentNode != null) {
			System.out.print(currentNode.val + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(7);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		printNodes(node1);
		
		ReverseLinkedList obj = new ReverseLinkedList();
		ListNode node = obj.reverseList(node1);
		printNodes(node);
	}
}
