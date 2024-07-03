package CodingNinjas;

public class queue_using_singlely_LL {

 private Node front;
 private Node rear;
 private int size;

 public Queue() {
     front = null;
     rear = null;
     size = 0;
 }

 public int getSize() {
     return size;
 }

 public boolean isEmpty() {
     return size == 0;
 }

 public void enqueue(int data) {
     Node newNode = new Node(data);
     if (rear == null) {
         front = newNode;
         rear = newNode;
     } else {
         rear.next = newNode;
         rear = newNode;
     }
     size++;
 }

 public int dequeue() {
     if (isEmpty()) {
         return -1;
     }
     int data = front.data;
     front = front.next;
     if (front == null) {
         rear = null;
     }
     size--;
     return data;
 }

 public int front() {
     if (isEmpty()) {
         return -1;
     }
     return front.data;
 }

}
