package stack;

import java.util.ArrayList;

public class Stack<E> {
    private ArrayList<E> stack;

    public Stack(){
        this.stack = new ArrayList<E>();
    }

    public void push(E item){
        this.stack.add(item);
    }

    public E pop(){
        return this.stack.remove(this.stack.size() - 1);
    }

    public void peek(){
        System.out.println(this.stack.get(this.stack.size() - 1));
    }

    public int getSize(){
        return this.stack.size();
    }
}
