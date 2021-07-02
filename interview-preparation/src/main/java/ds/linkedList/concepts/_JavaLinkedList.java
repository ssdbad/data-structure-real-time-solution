package ds.linkedList.concepts;

import java.util.LinkedList;

/**
 * Refer for more clarification
 * https://www.geeksforgeeks.org/linked-list-in-java/ 
 */
public class _JavaLinkedList {
    public static void main(String[] args) {
        //creating object of Linked List
        LinkedList<Object> linkedList = new LinkedList<>();

        //Let's add some element to linked List. 
        // In addition of object, consecutive memory is not allocated.
        linkedList.add("Gautam Raj");
        linkedList.add("Java Linked List");
        linkedList.add(1001);
        linkedList.add(1,"Sonu Singh"); // Here element is added at index 1, and shift operation will happen.
        System.out.println(linkedList);

        //Let's try to remove some element from linked list
        linkedList.remove(2);// "Java Linked List" element will be removed
        System.out.println(linkedList);

        linkedList.removeFirst();// removeFirst() is implemented from @Deque interface
        linkedList.removeLast();// removeLast() is implemented from @Deque interface
    }
}
