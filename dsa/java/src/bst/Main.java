package bst;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(100);
        Tree tree = new Tree(root);

        Node node1 = new Node(90);
        Node node2 = new Node(80);
        Node node3 = new Node(110);
        Node node4 = new Node(120);
        Node node5 = new Node(70);

        tree.insertNode(node1);
        tree.insertNode(node2);
        tree.insertNode(node3);
        tree.insertNode(node4);
        tree.insertNode(node5);

    }
}
