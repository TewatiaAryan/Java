class Node{
    String data;
    Node next;
    Node(String data) {
        this.data=data;
        this.next=null;
    }
}
public class linked_list{
    Node head;
    linked_list() {
        head=null;
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            newNode.next=null;
        }
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty !!");
        }
        else{
        Node currNode=head;
        while(currNode!=null){
            System.out.print("-->"+currNode.data );
            currNode = currNode.next;
            }
        }
    }
    public static void main(String[] args){
        linked_list obj = new linked_list();
        obj.addFirst("this");
        obj.addFirst("is");
        obj.addFirst("a");
        obj.printList();
    }
}
