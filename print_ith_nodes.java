package CodingNinjas;

import java.util.LinkedList;

public class print_ith_nodes {
	public static void printIthNode(LinkedListNode<Integer> head, int i){
		 int count=0;
     LinkedList<Integer> temp=head;
        while(count!=i && temp!=null)
        {
            temp=temp.next;
            count++;
        }
       if( count==i &&temp!=null)
           System.out.println(temp.data);
		
}
}
