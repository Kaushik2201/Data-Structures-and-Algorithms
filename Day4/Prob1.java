package Day4;


// Maximum depth of the tree 
public class Prob1{
    // Create the tree
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int maxDepth(Node root){

        int Height = 0;

        // Base case 
        if(root == null){
            return 0;
        }

        // For left n right child 
     else{
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        Height = Math.max(lh, rh)+1;
        return Height;
     }


    }

    public static void main(String[] args) {

        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        int h = maxDepth(root);
        System.out.println(h);

        
    }
}