package reverse;

import java.util.LinkedList;

public class Reverse_linkedList {
	 public static void main(String[] args) 
	    { 
	        // Declaring linkedlist without any initial size 
	        LinkedList<String> linkedli = new LinkedList<String>(); 
	        // Appending elements at the end of the list 
	        linkedli.add("Cherry"); 
	        linkedli.add("Chennai"); 
	        linkedli.add("Bullet"); 
	        System.out.print("Elements before reversing: " + linkedli); 
	        linkedli = reverseLinkedList(linkedli); 
	        System.out.println("\nElements after reversing: " + linkedli); 
	        
	        Node head = new Node(85); 
	        Node nextNode = new Node(15);
	        Node nnextNode = new Node(5);
	        head.next = nextNode;
	        nextNode.next = nnextNode;
	        
	        Node currNode = head;
	        while (currNode != null) {
	        	System.out.print(currNode.val + " ");
	        	currNode = currNode.next;
	        }
	        
	        
	        System.out.print("\n");
	        Node newNode = reverseLL(head);
	        while (newNode != null) {
	        	System.out.print(newNode.val + " ");
	        	newNode = newNode.next;
	        }
	    } 
	  
	    // Takes a linkedlist as a parameter and returns a reversed linkedlist 
	    private static LinkedList<String> reverseLinkedList(LinkedList<String> llist) 
	    { 
	        LinkedList<String> revLinkedList = new LinkedList<String>(); 
	        for (int i = llist.size() - 1; i >= 0; i--) { 
	  
	            // Append the elements in reverse order 
	            revLinkedList.add(llist.get(i)); 
	        } 
	        // Return the reversed arraylist 
	        return revLinkedList; 
	    } 
	    
	    private static Node reverseLL(Node head) {
	    	Node preNode = null;
	    	Node currNode = head;
	    	Node nextNode = null;
	    	
	    	while (currNode != null) {
	    		nextNode = currNode.next;
	    		currNode.next = preNode;
	    		preNode = currNode;
	    		currNode = nextNode;	
	    	}
	    	
	    	return preNode;
	    
	    }
}
