package BST;

public class BSTRunner {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(5);
        bst.insert(15);
        bst.insert(25);
        bst.insert(35);
        bst.insert(-4);

        if(bst.search(5)) {
            System.out.println("it is in the tree!");
        } else {
            System.out.println("not in the tree!");
        }
        if(bst.search(45)) {
            System.out.println("it is in the tree!");
        } else {
            System.out.println("not in the tree!");
        }
        if(bst.search(25)) {
            System.out.println("it is in the tree!");
        } else {
            System.out.println("not in the tree!");
        }
        if(bst.search(95)) {
            System.out.println("it is in the tree!");
        } else {
            System.out.println("not in the tree!");
        }

    }
}
