package CodingNinjas;
import java.util.*;

public class reverse_stack {




	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		   if (input.size()==0 || input.size()==1)
        {
            return;
        }
        
        int top=input.pop();
        reverseStack(input,extra);
        
        while(!input.isEmpty())
        {
            extra.push(input.pop());
        }
        input.push(top);
        
        while(!extra.isEmpty())
        {
            input.push(extra.pop());
        }
	}


}
