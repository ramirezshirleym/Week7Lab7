/* 
 * This is a modified version of the LinkedStack class 
 * 1. Constructor was modified to reflect the name of this class
 * 2. removeBottomHalf method was added
 */

public class ModifiedLinkedStack {

	// This class implements a Stack ADT as a linked list
	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Number of nodes in the list

	// Constructor - initializes the front and count variables
	ModifiedLinkedStack() {
		front = null;
		count = 0;
	}

	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	// Implements the peek operation
	int peek() {
		return front.x;
	}

	// Implements the isEmpty operation
	boolean isEmpty() {
		return front == null;
	}

	// Implements the size operation
	int size() {
		return count;
	}

	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}

	// This method removes the half of elements at the bottom of the stack in O(n)
	public void removeBottomHalf() {
		int midPoint = count / 2;
		LinkedNode last = front;
		int count = 1;
		while (count < midPoint) {
			last = last.next;
			count++;
		}
		last.next = null;
	}

}
