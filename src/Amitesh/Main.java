package Amitesh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BTreeLinkedList queue=new BTreeLinkedList();
		
		queue.insert(10);
		queue.insert(54);
		queue.insert(78);
		queue.insert(1540);
		queue.insert(65);
		queue.insert(6);
		queue.insert(43);
		queue.insert(78);
		queue.insert(345);
		queue.insert(23);
		queue.insert(678);
		queue.insert(435);
		
		queue.search(23);
		
		queue.deleteNodeOfBinaryTree(678);
		
		queue.levelOrder();
		
		//queue.preorder(queue.root);
		queue.postorder(queue.root);
		
		
		

	}

}
