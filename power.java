package CodingNinjas;

public class power {


		public static int power(int x, int n) {
			if(n==0){
	          return 1;
	        }
	      	if(n==1){
	          return x;
	        }
	      	int mult=power(x,n-1);
			return x*mult;
		
		
			
		}
	}


