package CodingNinjas;

public class last_index_of_a_number {



	public static int lastIndex(int input[], int x) {
		
        return helper(input,x,input.length-1);
	}
	
    public static int helper(int a[],int x, int li){
        if(li<0)
            return -1;
        
        if(a[li]==x)
            return li;
        
        int smallanswer=helper(a,x,li-1);
        return smallanswer;
    }
}
	


