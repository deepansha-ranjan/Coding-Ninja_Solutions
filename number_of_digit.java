package CodingNinjas;

public class number_of_digit {


		public static int count(int n){
			if(n == 0){
	        return 0;
	    }
	    int smallAns = count(n / 10);
	    return smallAns + 1;
		}
			

	}



