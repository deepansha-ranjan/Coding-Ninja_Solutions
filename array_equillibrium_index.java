package CodingNinjas;

public class array_equillibrium_index {
	

		public static int arrayEquilibriumIndex(int[] arr){  
			 int ts=0,leftsum=0,rightsum=0;
	        for(int i=0;i<arr.length;i++){
	            ts+=arr[i];
	        }
	        int i=0;
	        while(i<arr.length){
	            rightsum=ts-leftsum-arr[i];
	            if(leftsum==rightsum)
	                return i;
	            else{
	                leftsum+=arr[i];
	                i++;
	            }
	        }
	        return -1;
			//Your code goes here
		}
	

}
