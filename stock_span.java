package CodingNinjas;

public class stock_span {
	

		public static int[] stockSpan(int[] price) {
			//Your code goes here
	        int[] span=new int[price.length];
	        Stack<Integer> stack=new Stack<Integer>();
	        span[0]=1;
	        stack.push(0);
	        
	        for (int i=1;i<price.length;i++)
	        {
	            while(!stack.isEmpty() && price[stack.peek()]<price[i])
	            {
	                stack.pop();
	            }
	            //System.out.println(stack.size());
	            
	            if (stack.isEmpty())
	            {
	                span[i]=i+1;
	            }
	            else
	            {
	                //System.out.println("i = "+i);
	                //System.out.println("top = "+stack.peek());
	                span[i]=i-stack.peek();
	            }
	            stack.push(i);
	            //System.out.println("New top: "+stack.peek());
	            //System.out.println();
	        }
	        return span;
	        
		}

	
}
