
package CodingNinjas;
import java.util.Scanner;


public class ComplexNumbers {

private int real1;
    private int imaginary1;
    
    
    public ComplexNumbers(int real1, int imaginary1){
        this.real1 = real1;
        this.imaginary1 = imaginary1;
    }
    
    void print(){
        System.out.println(this.real1 + " + " + "i" + this.imaginary1);
    }
    
    void plus(ComplexNumbers c2){
        this.real1 = this.real1 + c2.real1;
        this.imaginary1 = this.imaginary1 + c2.imaginary1;
    }
    
    void multiply(ComplexNumbers c2){
        int x = (((this.real1) * c2.real1) - ((this.imaginary1) * c2.imaginary1));
        this.imaginary1 =  (((this.real1) * c2.imaginary1) + ((this.imaginary1) * c2.real1));
        this.real1 = x;
    }
	



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();

		 if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}





