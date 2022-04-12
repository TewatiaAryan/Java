import java.util.*;
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class tree_traversal {
    static Node create(){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        System.out.println("Enter the value : ");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        root=new Node(data);
        System.out.println("Enter the left child of "+root.data+" : ");
        root.left=create();
        System.out.println("Enter the right value of the "+root.data+" : ");
        root.right=create();
        return root;
    }
    static void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    static void preorder(Node root){
        if(root==null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        Node root=create();
        System.out.print("inorder traversal is : ");
        inorder(root);
        System.out.println("preorder traversal is : ");
        preorder(root);
        System.out.println("postorder traversal is : ");
        postorder(root);
    }
}
