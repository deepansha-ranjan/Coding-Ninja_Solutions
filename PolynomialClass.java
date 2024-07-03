
package CodingNinjas;
import java.util.Scanner;

public class PolynomialClass {
	 int degcoeff[];
	    PolynomialClass(){
		degcoeff = new int[10];
		}

		/*
		 * This function sets coefficient for a particular degree value, if degree is
		 * not there in the polynomial
		 * then corresponding term(with specified degree and value is added int the
		 * polynomial. If the degree
		 * is already present in the polynomial then previous coefficient is replaced by
		 * new coefficient value passed as function argument
		 */
		public void setCoefficient(int degree, int coeff) {
			// this.degree[degree] = coeff;
			 if(degree>degcoeff.length-1)
	     {
	         int temp[]=degcoeff;
	         degcoeff=new int[degree+1];
	         for(int i=0;i<temp.length;i++)
	         {
	             degcoeff[i]=temp[i];
	         }
	     }
	       degcoeff[degree]=coeff; 

		}

		// Prints all the terms(only terms with non zero coefficients are to be printed)
		// in increasing order of degree.
		public void print() {
			for (int i = 0; i < degcoeff.length; i++) {
				if (degcoeff[i] != 0)
					System.out.print(degcoeff[i] + "x" + i + " ");
			}
		}

		// Adds two polynomials and returns a new polynomial which has result
		public PolynomialClass add(PolynomialClass p) {
			// for (int i = 0; i < 200; i++) {
			// 	this.degree[i] = this.degree[i] + p.degree[i];
			// }

			PolynomialClass ans = new PolynomialClass();
			int plen1 = this.degcoeff.length;
			int plen2 = p.degcoeff.length;
			int len = Math.min(plen1,plen2);
			// return this;
			int i;
			for(i =0;i<len;i++){
				 ans.setCoefficient(i,this.degcoeff[i] + p.degcoeff[i]);  
			}
			while(i<plen1){
				 ans.setCoefficient(i,this.degcoeff[i]);
				 i++;
			}

			while(i<plen2){
				ans.setCoefficient(i,p.degcoeff[i]);
				i++;
			}
			return ans;

		}

		// Subtracts two polynomials and returns a new polynomial which has result
		public PolynomialClass subtract(PolynomialClass p) {
			// for (int i = 0; i < 200; i++) {
			// 	this.degree[i] = this.degree[i] - p.degree[i];
			// }
			// return this;

			int plen1 = this.degcoeff.length;
			int plen2 = p.degcoeff.length;
			int len = Math.min(plen1,plen2);
			PolynomialClass ans = new PolynomialClass();
			// return this;
			int i;
			for(i =0;i<len;i++){
				 ans.setCoefficient(i,this.degcoeff[i] - p.degcoeff[i]);  
			}
			while(i<plen1){
				 ans.setCoefficient(i,this.degcoeff[i]);
				 i++;
			}

			while(i<plen2){
				ans.setCoefficient(i,-p.degcoeff[i]);
				i++;
			}
			return ans;
		}


	   public int getCoeff(int degree){
	        if(degree<this.degcoeff.length){
	            return degcoeff[degree];
	        }else{
	            return 0;
	        }
	    }
		// Multiply two polynomials and returns a new polynomial which has result
		public PolynomialClass multiply(PolynomialClass p){
		
		      PolynomialClass ans = new PolynomialClass();
			  for(int i=0;i<this.degcoeff.length;i++){
				  for(int j=0;j<p.degcoeff.length;j++){
					  int termdeg = i+j;
					  int termcoeff = this.degcoeff[i]*p.degcoeff[j];
					  int oldcoeff = ans.getCoeff(termdeg);
					   ans.setCoefficient(termdeg, termcoeff + oldcoeff);
	            }
				  }
				  return ans;
			  }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int degree1[] = new int[n];
			for(int i = 0; i < n; i++){
				degree1[i] = s.nextInt();
			}
			int coeff1[] = new int[n];
			for(int i = 0; i < n; i++){
				coeff1[i] = s.nextInt();
			}
			PolynomialClass first = new PolynomialClass();
			for(int i = 0; i < n; i++){
				first.setCoefficient(degree1[i],coeff1[i]);
			}
			n = s.nextInt();
			int degree2[] = new int[n];
			for(int i = 0; i < n; i++){
				degree2[i] = s.nextInt();
			}
			 int coeff2[] = new int[n];
			for(int i = 0; i < n; i++){
				coeff2[i] = s.nextInt();
			}
			PolynomialClass second = new PolynomialClass();
			for(int i = 0; i < n; i++){
				second.setCoefficient(degree2[i],coeff2[i]);
			}
			int choice = s.nextInt();
			PolynomialClass result;
			switch(choice){
			// Add
			case 1: 
				 result = first.add(second);
				result.print();
				break;
			// Subtract	
			case 2 :
				 result = first.subtract(second);
				result.print();
				break;
			// Multiply
			case 3 :
				 result = first.multiply(second);
				result.print();
				break;
			}

		}


}
