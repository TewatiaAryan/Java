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
public class sum_of_node_of_tree {
    static  Node create(){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        System.out.println("Enter the value : ");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        root=new Node(data);
        System.out.println("Enter the left value of "+root.data+" : ");
        root.left=create();
        System.out.println("Enter the right value of "+root.right+" : ");
        root.right=create();
        return root;
    }
    static int sum(Node root){
        if(root==null)
            return 0;
        int left_sum=sum(root.left);
        int right_sum=sum(root.right);
        return (left_sum+right_sum+root.data);
    }
    public static void main(String[] args) {
        Node root=create();
        System.out.println(sum(root));
    }
}
