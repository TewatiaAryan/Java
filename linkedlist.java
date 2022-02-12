public class linkedlist{
    public static class Node{
        int data;      
        Node next;     
    }
    public static void main(String args[]){
        Node newnode1=new Node();   
        Node newnode2=new Node();   
        Node newnode3=new Node();    
        Node newnode4=new Node();    
        newnode1.data=1;
        newnode2.data=2;
        newnode3.data=3;
        newnode4.data=4;
        newnode1.next=newnode2;       
        newnode2.next=newnode3;
        newnode3.next=newnode4;
        newnode4.next=null;
       for (int i=1;i<=4;i++){
            System.out.print(newnode1.data+" ");
            newnode1=newnode1.next;  
        }
    }
}
