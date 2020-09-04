class TreeNode {

	private value: number;
	private left: TreeNode;
	private right: TreeNode;

	constructor(value: number, left: TreeNode, right: TreeNode) {
		this.value = (value === undefined ? 0 : value);
		this.left = (left === undefined ? null : left);
		this.right = (right === undefined ? null : right);
	}

	getValue(): number {
		return this.value;
	}

	setValue(value: number) {
		this.value = value;
	}

	getLeftNode(): TreeNode {
		return this.left;
	}

	setLeftNode(left: TreeNode) {
		this.left = left;
	}

	getRightNode(): TreeNode {
		return this.right;
	}

	setRightNode(right: TreeNode) {
		this.right = right;
	}
}


class Tree {
	private root: TreeNode;

	constructor(root: TreeNode) {
		this.root = (root === undefined ? null : root);
	}

	getHead(): TreeNode {
		return this.root;
	}

	setHead(root: TreeNode) {
		this.root = root;
	}

	addNode(node: TreeNode) {
		console.log('Node ' + node.getValue());
		// No root
		if (this.root == null) {
			this.root = node
			return;
		}

		let root = this.root;
		let traversing: boolean = true;

		while (traversing) {
			// Go left
			if (root.getValue() >= node.getValue()) {
				if (root.getLeftNode() == null) {
					root.setLeftNode(node);
					traversing = false;
					console.log('adding to left of ' + root.getValue());
				} else {
					root = root.getLeftNode();
				}
			} else {
				// Go right
				if (root.getRightNode() == null) {
					root.setRightNode(node);
					traversing = false;
					console.log('adding to right of ' + root.getValue());
				} else {
					root = root.getRightNode();
				}
			}
		}

	}

}

let root = new TreeNode(30, null, null);
let tree = new Tree(root);
let node1 = new TreeNode(20, null, null);
let node2 = new TreeNode(10, null, null);
let node3 = new TreeNode(15, null, null);
let node4 = new TreeNode(40, null, null);
let node5 = new TreeNode(50, null, null);
let node6 = new TreeNode(45, null, null);
tree.addNode(node1);
tree.addNode(node2);
tree.addNode(node3);
tree.addNode(node4);
tree.addNode(node5);
tree.addNode(node6);
