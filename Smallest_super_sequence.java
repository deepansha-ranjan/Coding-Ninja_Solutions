package CodingNinjas;

public class Smallest_super_sequence {
	
		public static int smallestSuperSequence(String str1, String str2) {
			 int n1=str1.length();
	        int n2=str2.length();
	        
	        int[][] dp = new int[n1+1][n2+1];
	        for (int i=n1;i>=0;i--)
	        {
	            dp[i][n2]=n1-i;
	        }
	        for (int i=n2;i>=0;i--)
	        {
	            dp[n1][i]=n2-i;
	        }
	        
	        for (int i=n1-1;i>=0;i--)
	        {
	            for (int j=n2-1;j>=0;j--)
	            {
	                if(str1.charAt(i)==str2.charAt(j))
	                {
						dp[i][j]=dp[i+1][j+1]+1;
	                }
	                else
	                {
	                    
	                    int ans1=dp[i+1][j];
	                    int ans2=dp[i][j+1];
	                    
	                    dp[i][j]=Math.min(ans1,ans2)+1;
	                }
	            }
	        }
	        
	        return dp[0][0];
	     
	}
}
