package ds.linkedList.concepts;

/**
 * Refer for more clarification
 * https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
 * 
 * Java program to implement Singly Linked List
 */
public class _LinkedList {

    Node head;// Head of the List
    
    //
    static class Node{
        Node next;
        Object data;
        Node(Object data){
            this.data = data;
            next = null;
        }
    }

    /**Method to used for adding new node for upcoming data*/
    public static _LinkedList add(_LinkedList list, Object data){
        //create new Node with given data
        Node newNode = new Node(data);
        newNode.next = null;
        //If the linked list is empty, then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        }else{
            //Else traverse till the last node and insert the new node
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            //add the new node at last node
            last.next = newNode;
        }
        //Return the list by head
        return list;
    }

    /**Method to print the Linked List */
    public static void print(_LinkedList linkedList){
        Node currentNode = linkedList.head;
        System.out.println("Linked List : ");
        /**Traverse through the Linked List head */

        while(currentNode != null){
            System.out.print(currentNode.data+" ");//print data at current node
            currentNode = currentNode.next;//Go to next node
        }
    }

    public static void main(String[] args) {
        /** start with empty list */
        _LinkedList linkedList = new _LinkedList();

        //Insert some values
        linkedList = add(linkedList, 1);
        linkedList = add(linkedList, 2);
        linkedList = add(linkedList, 4);
        linkedList = add(linkedList, "Gautam");
        linkedList = add(linkedList, "Raj");
        linkedList = add(linkedList, 5);
        linkedList = add(linkedList, 7);
        linkedList = add(linkedList, 6);

        print(linkedList);
    }
}