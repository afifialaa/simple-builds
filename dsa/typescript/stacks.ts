class Stack <T>{

    private stack;

    constructor(){
        this.stack = [];
    }

    public pop(){
        this.stack.pop();
    }

    public peek(){
        return this.stack[this.stack.length - 1];
    }

    public push(item: T){
        this.stack.push(item);
    }

    public getLength():number{
        return this.stack.length;
    }
}

let stack = new Stack();

stack.push(10);
stack.push(10);
stack.push(10);
stack.push(10);
stack.push(10);
stack.push(120);

console.log(stack.getLength());
console.log(stack.peek());
stack.pop();
console.log(stack.peek());