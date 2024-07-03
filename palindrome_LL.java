package CodingNinjas;

public class palindrome_LL {

    private static  LinkedListNode<Integer>reverseLinkedList(LinkedListNode<Integer> head){
    LinkedListNode<Integer> prev =null;
    LinkedListNode<Integer> curr =head;
    LinkedListNode<Integer> next =null;

     while(curr!= null){

       next = curr.next;
       curr.next = prev;
       prev = curr;
       curr = next;
     }
     return prev;
    }
     public static boolean isPalindrome(LinkedListNode<Integer> head){

         if(head== null || head.next== null){
             return true;
         }
          
           LinkedListNode<Integer>fast = head;
           LinkedListNode<Integer> slow = head;

           while(fast.next!=null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
           }
           
           LinkedListNode<Integer>secondhead = slow.next;
           slow.next = null;
           secondhead = reverseLinkedList(secondhead);

            LinkedListNode<Integer>firstsublist = secondhead;
            LinkedListNode<Integer> secondsublist = head;
            while(firstsublist!= null){

                if(firstsublist.data!= secondsublist.data){
                    return false;
                }
                firstsublist= firstsublist.next;
                secondsublist = secondsublist.next;

            }
             firstsublist = head;
             secondsublist= reverseLinkedList(secondhead);
             while(firstsublist.next!= null){
                 firstsublist= firstsublist.next;
             }
             firstsublist.next = secondsublist;
             return true;

     }

}
