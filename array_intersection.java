package CodingNinjas;
import java.util.*;

public class array_intersection {
	
	

		public static void intersection(int[] input1, int[] input2) {
	    Arrays.sort(input1);
	    Arrays.sort(input2);
			for(int i=0;i<input1.length;i++)
	        {   
	         
	                  for(int j=0;j<input2.length;j++)
	                    {

	                      if(input1[i]==input2[j])
	                      {System.out.print(input1[i]+" ");
	                       input2[j]=Integer.MIN_VALUE;
	                       break;
	                       
	                      }
	                    }

	      
		}

	}


}
