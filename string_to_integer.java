package CodingNinjas;

public class string_to_integer {
	public static int convertStringToInt(String input){
		 if(input.length()==1)
           return input.charAt(0)-'0';
       int ans=convertStringToInt(input.substring(1));
       int x= input.charAt(0)-'0';
       x= x*(int)Math.pow(10,input.length()-1)+ans;
       return x;
		

	}

}
