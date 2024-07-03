package CodingNinjas;

public class reverse_queue {
	

		public static void reverseQueue(Queue<Integer> input) {
			 if(input.size()<=1)
	        return;
	    
	     
	     int front=input.peek();
	    input.remove();
	     reverseQueue(input);
	     input.add(front);
			//Your code goes here
		}

	
}
