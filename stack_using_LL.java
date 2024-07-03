package CodingNinjas;

public class stack_using_LL {
	

		   private Node head; // Head of the stack, pointing to the top element
		   private int size; // Number of elements in the stack

		    public Stack() {
		        head = null; // Initialize the head to null when creating an empty stack
		        size = 0;    // Initialize the size to 0
		    }

		    public int getSize() { 
		        return size;  // Return the current size of the stack
		    }

		    public boolean isEmpty() {
		        return (getSize() == 0); // Check if the stack is empty by comparing its size to 0
		    }

		    public void push(int element) {
		        Node newNode = new Node(element); // Create a new node with the given element
		        newNode.next = head; // Set the new node's 'next' to the current head (top element)
		        head = newNode; // Update the head to the new node, making it the new top element
		        size++; // Increase the size by 1
		    }

		    public int pop() {
		        if (getSize() == 0) {
		            return -1; // If the stack is empty, return -1 to indicate an error
		        }        
		        int temp = head.data; // Get the data of the current top element
		        head = head.next; // Move the head to the next element in the stack
		        size--; // Decrease the size by 1
		        return temp; // Return the removed element's data
		    }

		    public int top() {
		        if (getSize() == 0) {
		            return -1; // If the stack is empty, return -1 to indicate an error
		        }  
		        return head.data; // Return the data of the top element without removing it
		    }
		}




