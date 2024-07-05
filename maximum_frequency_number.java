package CodingNinjas;

public class maximum_frequency_number {

	    public static int maxFrequencyNumber(int[] arr){ 
			  HashMap<Integer,Integer> countMap = new HashMap<>();

	        for (int i=0;i<arr.length;i++)
	        {
	            int ele=arr[i];
	            if (countMap.containsKey(ele))
	            {
	                countMap.put(ele,countMap.get(ele)+1);
	            }
	            else
	            {
	                countMap.put(ele,1);
	            }
	            
	        }
	        
	        int maxCount = Integer.MIN_VALUE, maxEle = arr[0];
	        for (int i=0;i<arr.length;i++)
	        {
	            if (countMap.get(arr[i])>maxCount)
	            {
	                maxCount=countMap.get(arr[i]);
	                maxEle=arr[i];
	            }
	        }
	        return maxEle;
		
	}


}
