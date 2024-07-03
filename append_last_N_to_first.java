package CodingNinjas;

public class append_last_N_to_first {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {


 if (head == null || n == 0){
	  return head; 
	  }	

		 LinkedListNode<Integer> temp=head;
        int count=0;
        while(temp!=null ){
            temp=temp.next;
            count++;
        }
        int newcount=count-n;
        count=0;
        LinkedListNode<Integer> temp1=head;
        while(count<newcount-1){
            temp1=temp1.next;
            count++;
        }
        LinkedListNode<Integer> temp2=temp1.next;
        LinkedListNode<Integer> temp3=temp1.next;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=head;
        temp1.next=null;
        return temp3;

	
	}


}
