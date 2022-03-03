public class PriorityQueueLinkedList{
  Node front;
  Node rear;
  public PriorityQueueLinkedList(){
    front=null;
    rear=null;
  }
  public void enqueue(Node newnode){
    if (front==null || newnode.priority<front.priority){
      newnode.next=front;
      front=ewnode;
    } else {
      Node temp = front;
      while (temp.next != null && temp.next.priority<=newnode.priority){
        temp=temp.next;
      }
      newnode.next=temp.next;
      temp.next=newnode;
    }
  }
  public void display(){
    Node temp=front;
    while(temp!=null){
      System.out.println(temp.data + " " + temp.priority);
      temp=temp.next;
    }
  }
}
