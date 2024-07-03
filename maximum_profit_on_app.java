package CodingNinjas;

public class maximum_profit_on_app {
	

		private static final String Array = null;

		public static int maximumProfit(int budget[]) {
		Array.sort(budget);
	      
	        
	        int ans=Integer.MIN_VALUE;
	        int n=budget.length;
	        // sort(budget,budget+n);
	    	for(int i=0;i<n;i++)
	    	{
	        	ans=Math.max(ans,budget[i]*(n-i));
	    	}
	    	return ans;
			
	}


}
