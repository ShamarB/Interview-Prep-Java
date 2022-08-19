package LinkedLists;

//Java program to implement
//a Singly Linked List
public class LinkedList {
	Node head; //head of list
	
	
	/* Linked list node */
	static class Node {
		int data;
		Node next;
		
		// Constructor to create a new node
		// Next is initialized as null by default
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	// ******************INSERTION****************************
	
	public static LinkedList insert(LinkedList list, int data) {
		
		Node new_node = new Node(data);
		new_node.next = null;
		
		// if the linked list is empty
		// then make the new node as the head
		
		if (list.head == null) {
			list.head = new_node;
		} else {
			// else you have to traverse the list and insert the new node at the end
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			
			//insert the new node at the end of the list
			last.next = new_node;
		}
		
		return list;
		
	}
	
	// ******************PRINT LIST****************************
	
	public static void printList(LinkedList list) {
		Node currentNode = list.head;
		
		System.out.print("Printed List: ");
		
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		
		System.out.println();
		
	}
	
	// ******************DELETION BY KEY****************************
	
	public static LinkedList deleteByKey(LinkedList list, int key) {
		Node currNode = list.head;
		Node prev = null;
		
		// CASE 1: if key is found at the head
		if (list != null && currNode.data == key) {
			list.head = currNode.next;
			System.out.println("Node found and deleted!");
			return list;
		}
		
		// CASE 2: if key is found somewhere in the middle or end
		
		// unless the key is found, continue to traverse through list
		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}
		
		// if the current node isn't null then the key has been found
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println("Node found and deleted!");
		}
		
		if (currNode == null) {
			System.out.println("Node not found");
		}
		
		return list;
	}
	
	// ******************DELETION BY POSTITION****************************
	
	public static LinkedList deleteByPosition(LinkedList list, int index) {
		Node currNode = list.head;
		Node prev = null;
		int nodeNum = 0;
		
		// CASE 1: if index is 0
		if (index == 0) {
			list.head = list.head.next;
			System.out.println("Node found and deleted!");
			return list;
		}
		
		while (currNode != null && index != nodeNum) {
			prev = currNode;
			currNode = currNode.next;
			nodeNum++;
		}
		
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println("Node found and deleted!");
		}
		
		if (currNode == null) {
			System.out.println("Index not found");
		}
		
		
		return list;
	}
	
	public static LinkedList reverse(LinkedList list) {
		Node currNode = list.head;
		Node prev = null;
		Node next = null;
		
		while (currNode != null) {
			next = currNode.next;
			currNode.next = prev;
			prev = currNode;
			currNode = next;
		}
		
		list.head = prev;
		
		return list;
	}
	
	
	// ******************ADD TWO LINKED LISTS MATHEMATICALLY****************************
	public static LinkedList addNums(LinkedList list1, LinkedList list2) {
		LinkedList list3 = new LinkedList();
		Node dummyhead = new Node(0);
		Node p = list1.head;
		Node q = list2.head;
		Node current = dummyhead;
		int carry = 0;
		
		while (p != null || q != null) {
			int x = (p != null) ? p.data : 0;
			int y = (q != null) ? q.data : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			current.next = new Node(sum % 10);
			current = current.next;
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		
		if (carry > 0) current.next = new Node(carry);
		
		list3.head = dummyhead.next;
		return list3;
	}
	
	// ******************COMBINE TWO ORDERED LINKED LISTS****************************
	public static LinkedList combine(LinkedList list1, LinkedList list2) {
		LinkedList list3 = new LinkedList();
		Node dummyhead = new Node(0);
		Node p = list1.head;
		Node q = list2.head;
		Node current = dummyhead;
		
		while (p != null && q != null) {
			if(p.data < q.data) {
				current.next = new Node(p.data);
				p = p.next;
			} else {
				current.next = new Node(q.data);
				q = q.next;
			}
			current = current.next;
		}
		
		if (p != null) {
			current.next = p;
		}
		
		if (q != null) {
			current.next = q;
		}
		
		list3.head = dummyhead.next;
		return list3;
		
	}
	
	
	// ******************REMOVE DUPLICATES***************************
	public static LinkedList removeDuplicates(LinkedList list) {
		LinkedList returnList = new LinkedList();
		Node dummyhead = new Node(0);
		Node current = dummyhead;
		while (current != null && current.next != null) {
			if (current.data == current.next.data)
				current.next = current.next.next;
			else
				current = current.next;
		}
		returnList.head = dummyhead.next;
		return returnList;
	}
	
	// ******************MAIN METHOD****************************
	
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();
		
		list1 = insert(list1, 1);
		list1 = insert(list1, 2);
		list1 = insert(list1, 2);
		list1 = insert(list1, 3);
		list1 = insert(list1, 3);
		list1 = insert(list1, 4);
//		list2 = insert(list2, 5);
//		list2 = insert(list2, 6);
//		list2 = insert(list2, 7);
//		list2 = insert(list2, 8);
//		list2 = insert(list2, 8);
		
		list3 = removeDuplicates(list3);
		printList(list1);
		printList(list3);
		
//		printList(list1);
//		printList(list2);
//		list3 = combine(list1, list2);
//		printList(list3);
//		list3 = addNums(list1, list2);
//		printList(list3);
		
//		printList(list1);
//		
//		deleteByPosition(list1, 9);
//		printList(list1);
//		reverse(list1);
//		printList(list1);
	}

}
