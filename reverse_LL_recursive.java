package CodingNinjas;

public class reverse_LL_recursive {

	public static Node<Integer> reverseRec(Node<Integer> head) {
         if(head==null)
            return head;
        if(head.next==null)
            return head;
        LinkedListNode<Integer> tail=head.next;
        LinkedListNode<Integer> smallhead=reverseRec(head.next);
        tail.next=head;
        head.next=null;
        return smallhead;
		
	}

}
}
