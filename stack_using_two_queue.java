package CodingNinjas;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class stack_using_two_queue {


    private Queue<Integer> queue1;
    private Queue<Integer> queue2;


    //Define the data members


    public void Stack() {
         this.queue1 = new LinkedList<Integer>();
        this.queue2 = new LinkedList<Integer>();
        //Implement the Constructor
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        return queue1.size() + queue2.size();
                

        //Implement the getSize() function
    }

    public boolean isEmpty() {
                
 return queue1.isEmpty() && queue2.isEmpty(); 
        //Implement the isEmpty() function
    }

    public void push(int element) {
         if (queue1.isEmpty()) {

            queue1.add(element);

            while (!queue2.isEmpty()) {

                queue1.add(queue2.remove());
            }
        } else {

            queue2.add( element);

            while (!queue1.isEmpty()) {

                queue2.add(queue1.remove());
            }
        }
        //Implement the push(element) function
    }

    public int pop() {
         if (queue1.isEmpty() && queue2.isEmpty()) {

            throw new NoSuchElementException("Stack is empty");
        }

        if (!queue1.isEmpty()) {

            return queue1.remove();
        } else {

            return queue2.remove();
        }
        //Implement the pop() function
    }

    public int top() {
		return 0;
        //Implement the top() function
    }

}
