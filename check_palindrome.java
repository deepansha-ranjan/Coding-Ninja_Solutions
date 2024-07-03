package CodingNinjas;

public class check_palindrome {
	public static boolean isStringPalindrome(String input) {
		 boolean isPalindrome = true;
		for(int i = 0,j = input.length() - 1;i < (input.length()/2);i++,j--){
		if(input.charAt(i) != input.charAt(j)){
		isPalindrome = false;
		break;
		}
		}
		return isPalindrome;
		
	}

}
