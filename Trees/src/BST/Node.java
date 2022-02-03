package BST;

public class Node {
    int data;
    Node low;
    Node high;

    Node(int inputData) {
        this.data = inputData;
        low = null;
        high = null;
    }
}
