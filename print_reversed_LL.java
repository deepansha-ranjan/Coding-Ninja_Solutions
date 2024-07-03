package CodingNinjas;

public class print_reversed_LL {



	public static void printReverse(LinkedListNode<Integer> root) {
		 if(root==null)
            return;
        printReverse(root.next); // function name wrong
        System.out.print(root.data+" ");
        
		
	}


}
