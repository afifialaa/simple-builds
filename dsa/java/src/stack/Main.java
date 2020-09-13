package stack;

public class Main {
    public static void main(String []args){
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.peek();
        int item = stack.pop();
        stack.peek();
    }
}
