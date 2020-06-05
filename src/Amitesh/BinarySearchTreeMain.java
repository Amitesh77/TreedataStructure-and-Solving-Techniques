package Amitesh;

public class BinarySearchTreeMain {
	
	public static void main(String[] args)
	{
		
		
		BinarySearchTree tree=new BinarySearchTree();
		
		tree.createNewNode(60);
		
		tree.insert(56);
		tree.insert(12);
		tree.insert(23);
		tree.insert(2);
		tree.insert(7);
		tree.insert(67);
		tree.insert(24);
		tree.insert(26);
		
		tree.printTreeGraphically();
		
		
		
	}

}
