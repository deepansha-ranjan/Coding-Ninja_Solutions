package CodingNinjas;

public class longest_consecutive_sequence {
	import java.util.Map;
	import java.util.HashMap;
	import java.util.ArrayList;

	public class Solution {
		public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
			  ArrayList<Integer> output = new ArrayList<>();
	        HashMap<Integer, Boolean> map = new HashMap<>();
	        HashMap<Integer, Integer> lenMap = new HashMap<>();
	        for (int i=0;i<arr.length;i++)
	        {
	            map.put(arr[i],true);
	        }
	        int maxStart=-1,maxLen=0;
	        boolean startCheck=true;
	        
	        for (int i: arr)
	        {
	            if (map.get(i))
	            {
	                int currStart=i,currLen=1;
	                //System.out.println("Current start of sequence: "+currStart);
	                //System.out.println("Current length of sequence: "+currLen);
	                boolean flag=true;
	                map.put(i,false);
	                
	                int ahead=i+1;
	                //System.out.println("Checking for values ahead");
	                //System.out.println();
	                while(flag)
	                {
	                    if(map.containsKey(ahead))
	                    {
	                        //System.out.println(ahead+" is included in sequence and status updates to false");
	                        currLen=currLen+1;
	                        map.put(ahead,false);
	                        ahead=ahead+1;
	                        //System.out.println("Current length of sequence: "+currLen);
	                    }
	                    else
	                    {
	                     	flag=false;   
	                    }
	                }
	               flag=true; 
	               int before=i-1;
	               //System.out.println();
	               //System.out.println("Checking for values before");
	                while(flag)
	                {
	                    if(map.containsKey(before))
	                    {
	                        //System.out.println(before+" is included in sequence and status updates to false");
	                        currLen=currLen+1;
	                        currStart=before;
	                        map.put(before,false);
	                        before=before-1;
	                        //System.out.println("Current length of sequence: "+currLen);
	                    }
	                    else
	                    {
	                     	flag=false;   
	                    }
	                }
	               
	               System.out.println();
	               if (currLen>=maxLen)
	               {
	                   maxLen=currLen;
	                   maxStart=currStart;   
	                   lenMap.put(maxStart,maxLen); 
	               }
	            }
	          
	        
	        for (int i=0;i<arr.length;i++)
	        {
	            if (lenMap.containsKey(arr[i]) && lenMap.get(arr[i])>=maxLen)
	            {
	                maxStart=arr[i];
	                maxLen=lenMap.get(arr[i]);
	                break;
	            }
	        }
	        output.add(maxStart);
	        output.add(maxStart+maxLen-1);
	        return output;
			
	    }
	}
}
