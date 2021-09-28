package ds.linkedList.questions;
/**
 *	Iterative Method:
 *	Input							Output 
 *	LinkedList Implementation		Reverse LinkedList
 *	1,5,2,4,6						6,4,2,5,1
 *	https://www.geeksforgeeks.org/reverse-a-linked-list/
 */
public class ReverseLinkedListElement_1 {
	static Node head;
	static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

	Node reverse(Node node){
		Node previous = null;
		Node current = node;
		Node next = null;
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		node = previous;
		return node;
	}

	//traversing of linked list
	void printList(Node node){
		while(node != null){
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedListElement_1 list = new ReverseLinkedListElement_1();
		head = new Node(1);
		head.next = new Node(5);
		head.next.next = new Node(2);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(6);
		System.out.println(" Input Linked List ");
		list.printList(head);

		head = list.reverse(head);
		System.out.println("");
		System.out.println(" Reverse Linked List ");
		list.printList(head);
	}
}