package BST;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int input) {
        Node node = new Node(input);

        //if the tree is empty
        if (root == null) {
            root = node;
            System.out.println(input + " added to the tree.");
            return;
        }

        if (input > root.data) {
            //input in the higher sub tree
            if (root.high == null) {
                root.high = node;
                System.out.println(input + " added to the tree.");
            } else {
                insertAt(node, root.high);
            }
        } else {
            //input in the lower sub tree
            if (root.low == null) {
                root.low = node;
                System.out.println(input + " added to the tree.");
            } else {
                insertAt(node, root.low);
            }
        }
    }

    private void insertAt(Node node, Node root) {
        if (node.data > root.data) {
            //input in the higher sub tree
            if (root.high == null) {
                root.high = node;
                System.out.println(node.data + " added to the tree.");
            } else {
                insertAt(node, root.high);
            }
        } else {
            //input in the lower sub tree
            if (root.low == null) {
                root.low = node;
                System.out.println(node.data + " added to the tree.");
            } else {
                insertAt(node, root.low);
            }
        }
    }


    public boolean search(int input) {
        if (root.data == input) {
            return true;
        } else {
            if (input > root.data) {
                return searchAt(input, root.high);
            } else {
                return searchAt(input, root.low);
            }
        }
    }

    private boolean searchAt(int input, Node root) {
        if(root == null) {
            return false;
        }
        if (root.data == input) {
            return true;
        } else {
            if (input > root.data) {
                return searchAt(input, root.high);
            } else {
                return searchAt(input, root.low);
            }
        }
    }
}
