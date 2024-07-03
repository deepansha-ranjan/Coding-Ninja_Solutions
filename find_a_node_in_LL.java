package CodingNinjas;

public class find_a_node_in_LL {

	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
			int count=0;
			// itreate a loop 
			while(head != null){
            
			if(head.data==n){
				return count;
			}
			else{
				count++;
			}
			head=head.next;
			}	
		return -1;
	}
}

