package CodingNinjas;

public class insert_node_in_LL {


	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
        // create node
	LinkedListNode<Integer> newnode=new LinkedListNode<Integer>(data);

    
   if(pos==0){
		newnode.next =head;
		return newnode;
	}
	else{
		int count=0;
		LinkedListNode<Integer> prev =head;
		while(count<pos-1 && prev!=null){
			count++;
			prev =prev.next;
		}
		if(prev!= null){
			newnode.next=prev.next;
			prev.next=newnode;
		}
		return head;
	}
		
		
	}

}
