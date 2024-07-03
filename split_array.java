package CodingNinjas;

public class split_array {



	public static boolean splitArray(int input[]) {
		
		return splitArray(input,0,0,0);
	}
    
     public static boolean splitArray(int arr[], int si, int lsum, int rsum) 
	{ 
        
  
    	if (si == arr.length) 
        {
            return lsum == rsum;
        }
         
    	if (arr[si] % 5 == 0)
        {
            lsum += arr[si];
        }
        else if (arr[si] % 3 == 0) 
        {
            rsum += arr[si]; 
        }
        else
        {
            return splitArray(arr,si+1, lsum+arr[si], rsum)  || splitArray(arr,si+1,lsum,rsum+arr[si]);
        }
         
    	return splitArray(arr,si+1,lsum,rsum); 
		

}


}
