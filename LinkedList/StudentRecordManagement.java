package LinkedList;

public class StudentRecordManagement {

    class Node {
    int data;
    Node next;
   }
   private Node head;
   private Node tail;
   private int size;

   public void AddFirst(int item){
    Node nn = new Node();
    nn.data = item;
    if(size == 0){
        head = nn;
        tail = nn;
        size++;
    }
    else{
        nn.next = head;
        head = nn;
        size++;
    }
   }

    public static void main(String[] args) {
        
    }
}
