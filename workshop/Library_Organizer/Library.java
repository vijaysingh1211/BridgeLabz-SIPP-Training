public class Library {
   class Node {
    int data;
    Node next;
   }
   private Node head;
   private Node tail;
   private int size;

   public void Insert(int item){
    if(size==0){
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
     else{
        Node nn = new Node();
        nn.data = item;
        tail.next = nn;
        tail = nn;
        size++;
     }
   }
}
