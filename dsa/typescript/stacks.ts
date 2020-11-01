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
stack.push(20);
stack.push(30);
stack.push(40);
stack.push(50);

console.log();
stack.pop();
console.log();