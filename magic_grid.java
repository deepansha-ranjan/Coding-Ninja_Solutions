package CodingNinjas;

public class magic_grid {
	
	    public static int getMinimumStrength(int[][] grid) {
	          int row=grid.length;
	        if (row==0)
	            return row;
	        
	        int col=grid[0].length;
	        if (col==0)
	            return col;
	        
	        int[][] dp=new int[row][col];
	        dp[row-1][col-1]=1;
	        
	        for (int i=col-2;i>=0;i--)
	        {
	        	dp[row-1][i]=dp[row-1][i+1]-grid[row-1][i];
	            
	        }
	        for (int i=row-2;i>=0;i--)
	        {
	            dp[i][col-1]=dp[i+1][col-1]-grid[i][col-1];
	        }
	        
	        
	        for(int i=row-2;i>=0;i--)
	        {
	            for (int j=col-2;j>=0;j--)
	            {                
	                int ans1=dp[i+1][j];
	                int ans2=dp[i][j+1];
	                
	                dp[i][j]=Math.max(1,Math.min(ans1,ans2)-grid[i][j]);
	            }
	        }
	        
	        return dp[0][0];


	}
}
