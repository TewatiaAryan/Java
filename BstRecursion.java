class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
public class BstRecursion {
    static Node root = null;
    public static Node insert(int value, Node root){
        Node newnode = new Node(value);
        if(root == null){
            root = newnode;
            return root;
        }
        if(root.data > value){
            if(root.left == null)
                root.left = newnode;
            else
                insert(value,root.left);
        }
        else if(root.data < value){
            if(root.right == null)
                root.right = newnode;
            else
                insert(value,root.right);
        }
        return root;
    }
    public static void preOrderTraversal(Node root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void inOrderTraversal(Node root){
        if(root == null)
            return;
        preOrderTraversal(root.left);
        System.out.print(root.data+" ");
        preOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        if(root == null)
            return;
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public static boolean searching(Node root, int value){
        if(root == null)
            return false;
        if(value== root.data)
            return true;
        boolean res = searching(root.left, value);
        if(res)
            return true;
        boolean res1 =searching(root.right, value);
        return res1;
    }
    public static void main(String[] args) {
        Node root = insert(50,null);
        insert(40,root);
        insert(80,root);
        insert(70,root);
        insert(45,root);
        insert(75,root);
        System.out.println("Pre order Traversal: ");
        preOrderTraversal(root);
        System.out.println("\nIn order Traversal: ");
        inOrderTraversal(root);
        System.out.println("\nPost order Traversal: ");
        postOrderTraversal(root);
        System.out.println("\n\nNode present in Tree: "+searching(root,10));
    }
}
