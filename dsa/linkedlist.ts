class List<T>{
	private head:ListNode<T>;

	constructor(head:ListNode<T>){
		this.head = head;
	}

	public getHead():ListNode<T>{
		return this.head;
	}

	public addValue(value:T){
		let node = new ListNode(value, null);

		let head = this.head;

		while(head.getNext() != null){
			head = head.getNext();
		}

		head.setNext(node);
		return;
	}

	public addNode(node:ListNode<T>){
		let head = this.head;

		while(head.getNext() != null){
			head = head.getNext();
		}

		head.setNext(node);
		return;
	}

	public printNodes(){
		let head = this.head;
		while(head != null){
			console.log(head.getValue());

			head = head.getNext();
		}
		return;
	}

	// Iterative
	public getLength():number{
		let head = this.head;
		let count:number = 0;

		while(head != null){
			count += 1;
			head = head.getNext();
		}
		return count;
	}

	// Recursive

	public getMiddleNode():ListNode<T>{
		let mid = Math.floor(this.getLength() / 2 );
		let head = this.head;
		let counter:number = 0;

		while(head != null && counter < mid){
			counter += 1;
			head = head.getNext();
		}
		return head;
	}

	public getTail():ListNode<T>{
		let head = this.head;

		while(head.getNext() != null){
			head = head.getNext();
		}
		return head;
	}

	public addNodeAt(node:ListNode<T>, pos:number){
		let head = this.head;
		let count = 1;

		while(head.getNext() != null && count < pos){
			head = head.getNext();
			count++;
		}

		node.setNext(head.getNext());
		head.setNext(node);
		return;
	}

	// Delete node
	public deleteNode(node:ListNode<T>):boolean{
		let curr = this.head;
		let prev = null;

		while(curr != null && curr.getValue() != node.getValue()){
			prev = curr;
			curr = curr.getNext();
		}

		if(curr.getValue() == node.getValue()){
			prev.setNext(curr.getNext());
			return true;
		}
		if(curr == null){
			return false;
		}
	}

	public deleteByPosition(pos:number):boolean{
		let curr = this.head;
		let prev = null;
		let counter = 1;

		while(curr != null && counter < pos){
			counter += 1;

			prev = curr;
			curr = curr.getNext();
		}

		if(curr == null){
			return false;
		}

		prev.setNext(curr.getNext());
		return true;
	}

	public findNode(node:ListNode<T>):boolean{
		let curr = this.head;

		while(curr != null && curr.getValue() != node.getValue()){
			curr = curr.getNext();
		}

		if(curr == null){
			return false;
		}
		if(curr.getValue() == node.getValue()){
			return true;
		}
	}

	public findValue(value:T):boolean{
		let curr = this.head;

		while(curr != null && curr.getValue() != value){
			curr = curr.getNext();
		}

		if(curr == null){
			return false;
		}
		if(curr.getValue() == value){
			return true;
		}
	}
}

class ListNode<T>{

	private value:T;
	private next: ListNode<T>;

	constructor(value: T, next:ListNode<T>){
		this.value = (value === undefined ? null : value);
		this.next = (next === undefined ? null :  next);
	}

	public setValue(value: T){
		this.value = value;
	}

	public getValue():T{
		return this.value;
	}

	public getNext():ListNode<T>{
		return this.next;
	}

	public setNext(node:ListNode<T>){
		this.next = node;
	}
}

let head = new ListNode(100, null);
let list = new List(head);

let node1 = new ListNode(200, null);
let node2 = new ListNode(300, null);
let node3 = new ListNode(400, null);
let node4 = new ListNode(500, null);
let node5 = new ListNode(600, null);
let node6 = new ListNode(700, null);
let node7 = new ListNode(800, null);
let testNode = new ListNode(1000, null);

list.addNode(node1);
list.addNode(node2);
list.addNode(node3);
list.addNode(node4);
list.addNode(node5);
list.addNode(node6);

let ans = list.findNode(testNode);
console.log(ans);
