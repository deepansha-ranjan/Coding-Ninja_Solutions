package CodingNinjas;

public class print_permutation_of_string {
	


		public static void permutations(String input){
			 permutationsHelper(input,"");

		}
	    
	    private static void permutationsHelper(String input, String output)
	    {
	        if (input.length()==0)
	            System.out.println(output);
	        
	        for (int i=0;i<input.length();i++)
	            permutationsHelper(input.substring(0,i)+input.substring(i+1), output+input.charAt(i));

		}
	}

