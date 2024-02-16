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


	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    	//Your code goes here
        if (head == null)
        {
            return head;
        }
        
        if (pos==0)
        {
            head=head.next;
            return head;
        }
        else
        {
            Node smallerHead=deleteNodeRec(head.next,pos-1);
            head.next=smallerHead;
            return head;
        }  
	}

}
