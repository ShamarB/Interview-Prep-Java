package LinkedLists;

public class MergeTwoSortedLists {
	
	public static class ListNode {
	    int val;
		ListNode next;
	    ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next;}
	}
	
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        return temp.next;
    }
    
    public static void printList(ListNode head) {
		ListNode currentNode = head;
		
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
		
		ListNode node5 = new ListNode(2);
		ListNode node6 = new ListNode(4);
		ListNode node7 = new ListNode(6);
		ListNode node8 = new ListNode(8);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		
		printList(node1);
		printList(node5);
		
		
		MergeTwoSortedLists obj = new MergeTwoSortedLists();
		obj.mergeTwoLists(node1, node5);
		
		printList(node1);
	}

}


	
 

