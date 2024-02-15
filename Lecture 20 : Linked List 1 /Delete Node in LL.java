/****************************************************************

	Following is the Node class already written for the Linked List

	class  Node<T> {
    	T data;
    	 Node<T> next;
    
    	public  Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// If the head is null, the list is empty, so we return null
        if (head == null) {
            return head;
        }

        // If the position is 0, we delete the first node by returning the next node
        if (pos == 0) {
            return head.next;
        }

        // Initialize a variable to keep track of the current node
        Node<Integer> current = head;

        // Traverse to the node just before the desired position
        for (int i = 0; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }

        // If the current node has a next node, we delete the next node
        if (current.next != null) {
            current.next = current.next.next;
        }

        // Return the head of the modified linked list
        return head;
	}
}
