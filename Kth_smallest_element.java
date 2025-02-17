package CodingNinjas;

public class Kth_smallest_element {
	
		public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
			  PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	        for(int i=0;i<k;i++)
	        {
	            pq.add(input[i]);
	        }
	        
	        for(int i=k;i<input.length;i++)
	        {
	            int maxVal=pq.peek();
	            if(maxVal>input[i])
	                maxVal=input[i];
	            if(maxVal!=pq.peek())
	            {
	                pq.poll();
	                pq.add(maxVal);
	            }
	        }
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        while(!pq.isEmpty())
	            arr.add(pq.poll());
	        return arr;


		}
	
}
