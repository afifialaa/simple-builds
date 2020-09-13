package linkedlist;

public class Main {
    public static void main(String []args){
        LinkedList list = new LinkedList();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.insertNode(50);

        list.insertAt(new Node(300), 3);
        list.printList();
        list.deleteNode(new Node(300));
        System.out.println("*********");
        list.printList();
    }
}
