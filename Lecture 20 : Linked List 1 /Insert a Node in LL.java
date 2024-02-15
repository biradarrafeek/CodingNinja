/*

	Following is the Node class already written for the Linked List

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		// If the position is 0, insert the new node at the beginning
		 if (pos == 0) {
            Node newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
        } else {
            int i = 0;
            Node n = head;
            // Traverse to the node just before the desired position
            for (i = 0; i < pos - 1 && n != null; i++) {
                n = n.next;
            }
            // If the position is valid (n is not null and pos > 0), insert the new node after n
            if (n != null && pos > 0) {
                Node newNode = new Node<>(data);
                newNode.next = n.next;
                n.next = newNode;
            }
        }
        
        return head;
	}
}

