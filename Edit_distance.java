package CodingNinjas;

public class Edit_distance {


	public static int editDistance(String s, String t) {
		//Your code goes here
		  //Find the lengths of both strings
        int m=s.length();
        int n=t.length();
        
        int[][] dp = new int[m+1][n+1];
        //Initializing dp for iterative approach
        for (int i=n;i>=0;i--)
            dp[m][i]=n-i;
        
        for (int i=m;i>=0;i--)
            dp[i][n]=m-i;
        
        for (int i=m-1;i>=0;i--)
        {
            for (int j=n-1;j>=0;j--)
            {
                if (s.charAt(i)==t.charAt(j))
                {
                    dp[i][j]=dp[i+1][j+1];
                }
                else
                {
                    int ans1=1+dp[i+1][j+1];
                    int ans2=1+dp[i][j+1];
                    int ans3=1+dp[i+1][j];
                    
                    dp[i][j]=Math.min(ans1,Math.min(ans2,ans3));
                }
            }
        }
        return dp[0][0];
    }


}
