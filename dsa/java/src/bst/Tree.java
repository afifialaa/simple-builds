package bst;

public class Tree {
    private Node root;

    Tree(){
        this.root = new Node();
    }

    Tree(Node root){
        this.root = root;
    }

    public void insertNode(Node node){
        // root is null
        if(this.root == null){
            this.root = node;
            return;
        }

        System.out.println("adding node " + node.getValue());
        Node curr = this.root;
        while(true){
            if(curr.getValue() >= node.getValue()){
                // went left
                if(curr.getLeft() == null){
                    System.out.println("adding node left of " + curr.getValue());
                    curr.setLeft(node);
                    break;
                }else{
                    curr = curr.getLeft();
                    continue;
                }
            }else{
                if(curr.getRight() == null){
                    curr.setRight(node);
                    System.out.println("adding node right of " + curr.getValue());
                    break;
                }else{
                    curr = curr.getRight();
                    continue;
                }
            }
        }

        return;
    }

    public void preorderTraverse(){
        Node curr = this.root;


    }
}
