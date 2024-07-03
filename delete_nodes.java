package CodingNinjas;

public class delete_nodes {

     


    public static void deleteAlternateNodes(Node<Integer> head) {
         while(head.next!=null){
             if(head.next.next!=null){
             head.next=head.next.next;
             head=head.next;
             }else{
                 head.next=null;
             }
         }
       
    }

}
