public class BST {
    class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    public BST() {
        this.root = null;
    }

    public void add(int value){
        root = insert(root, value);
    }
    private Node insert(Node root,int value) {
        if(root == null){
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        }else if(value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public boolean contains(int value){
        return find(root, value);
    }

    public boolean find(Node root,int value) {
        if (root.data == value) {
            return true;
        }
        else if (value < root.data) {
            if (root.left == null) {
                return false;
            }
            else {
                return find(root.left, value);
            }
        }
        else {
            if (root.right == null) {
                return false;
            }
            else {
                return find(root.right,value);
            }
        }
    }

    public void printInOrder(){
        InOrderTraverse(root);
    }

    private void InOrderTraverse(Node root) {
        if (root != null) {
            InOrderTraverse(root.left);
            System.out.println(root.data);
            InOrderTraverse(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.add(20);
        tree.add(40);
        tree.add(50);
        tree.add(10);
        tree.add(5);
        tree.printInOrder();
        System.out.println(tree.contains(40));

    }
}
