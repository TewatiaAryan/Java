import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class no_of_nodes_in_tree{
    static Node create(){
        Node root=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value : ");
        int data=sc.nextInt();
        if(root==null)
            return null;
        root=new Node(data);
        System.out.println("Enter the left value of "+root.data+" : ");
        root.left=create();
        System.out.println("Enter the right value of "+root.data+" : ");
        root.right=create();
        return root;
    }
    public static int CountOfNodes(Node root){
        if(root==null)
            return 0;
        int leftNode=CountOfNodes(root.left);
        int rightNode=CountOfNodes(root.right);
        return (leftNode+rightNode+1);
    }
    public static void main(String[] args) {
        Node root=create();
        System.out.println(CountOfNodes(root));
    }
}
