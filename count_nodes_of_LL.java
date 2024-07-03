package CodingNinjas;

public class count_nodes_of_LL {


	public static int length(LinkedListNode<Integer> head){

		  if (head == null){
            return 0;
        }
		LinkedListNode<Integer> temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        return count;
		
}
}
