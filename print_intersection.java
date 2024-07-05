package CodingNinjas;

public class print_intersection {

		public static void printIntersection(int[] arr1,int[] arr2){
			 HashMap<Integer, Integer> map = new HashMap<>();
	        
	        for(int key:arr1)
	        {	
	            if(map.containsKey(key))
	        	{
	            	map.put(key,map.get(key)+1);
	        	}
	            else
	            {
	                map.put(key,1);
	            }
	            
	        }
	        Arrays.sort(arr2);
	        for (int key:arr2)
	        {
	            if (map.containsKey(key))
	            {
	                int val = map.get(key);
	                if (val>0)
	                {
	                    System.out.println(key);
	                    map.put(key,val-1);
	                }
	                
	            }
	        }   
		
	}
}
