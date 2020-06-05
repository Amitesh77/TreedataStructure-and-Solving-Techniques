package Amitesh;

import java.util.LinkedList;
import java.util.Queue;

import node.BinaryNode;

public class BinarySearchTree {
	
	BinaryNode root;

	public BinaryNode getRoot() {
		return root;
	}

	public BinarySearchTree() {
		
		root = null;
	}
	
	public BinaryNode createNewNode(int value)
	{
		 BinaryNode node =new BinaryNode();
		 
		 node.setValue(value);
		 return node;
	}
	
	
	//Helper MEthod
	public BinaryNode insertNode(BinaryNode currentnode,int value)
	{
		if(currentnode==null)
		{
			System.out.println("Successfully inseted  "+value+" in BST");
			return createNewNode(value);
		}
		
		else if(value<currentnode.getValue())
		{
			currentnode.setLeft(insertNode(currentnode.getLeft(),value));
			return currentnode;
		}
		
		else
		{
			currentnode.setRight(insertNode(currentnode.getRight(),value));
			return currentnode;
		}
	}
	
	
	//Insert method
	public void insert(int value)
	{
		root=insertNode(root,value);
	}
	
	public static BinaryNode getminimumElement(BinaryNode root)
	{
		if(root.getLeft()==null)
		{
			return root;
		}
		
		else
		{
			return getminimumElement(root.getLeft());
		}
	}
	
	public BinaryNode deleteNodeBST(BinaryNode root,int value)
	{
		if(root==null)
		{
			System.out.println();
			return null;
		}
		
		else if(value<root.getValue())
		{
			root.setLeft(deleteNodeBST(root.getLeft(),value));
		}
		
		else if(value>root.getValue())
		{
			root.setRight(deleteNodeBST(root.getRight(),value));
		}
		
		else //if current node is the node to be deleted
		{
			if(root.getLeft()!=null && root.getRight()!=null) //both children are there
			{
				BinaryNode temp=root;
				
				BinaryNode minNodeforRight=getminimumElement(temp.getRight());  // Finding minimum element from right subtree
				
				root.setValue(minNodeforRight.getValue());  // Replacing current node with minimum node from right subtree
				
				root.setRight(deleteNodeBST(root.getRight(),minNodeforRight.getValue()));   // Deleting minimum node from right now
			}
			
			else if(root.getLeft()!=null) // if nodeToBeDeleted has only left child
			{
				root=root.getLeft();
			}
			
			else if(root.getRight()!=null)  // if nodeToBeDeleted has only right child
			{
				root=root.getRight();
			}
			
			else  // if nodeToBeDeleted do not have child (Leaf node)
			{
				root=null;
			}
	
		}
		return root;

	}
	
	public void deleteNodeofBST(int value)
	{
		System.out.println("\n\nDeleting " + value + " from BST...");
		
		deleteNodeBST(root,value);
	}
	
	public BinaryNode SearchNode(BinaryNode node,int value)
	{
		if(node==null)
		{
			System.out.println("Value: " + value + " not found in BST.");
			return null;
		}
		
		else if(value==node.getValue()) {
			
			System.out.println("Value: " + value + " found in BST.");
			return node;
			
		}
		
		else if(value<node.getValue())
		{
			return SearchNode(node.getLeft(),value);
		}
		
		else
		{
			return SearchNode(node.getRight(),value);
		}
	
	}
	
	public void SearchForValue(int value)
	{
		SearchNode(root,value);
	}
	
	// Delete entire BST
		public void deleteTree() {
			System.out.println("Deleting entire Tree...");
			root = null;
			System.out.println("Tree deleted successfully !");
		}// end of method
		
		
		
		void printTreeGraphically() {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			Queue<Integer> level = new LinkedList<Integer>();
			
			int CurrentLevel = 1;
			boolean previousLevelWasAllNull = false;
			queue.add(root);
			level.add(1);
			
			System.out.println("\nPrinting Level order traversal of Tree...");
			if(root == null) {
				System.out.println("Tree does not exists !");
				return;
			}
			
			while (!queue.isEmpty()) {
				if(CurrentLevel == level.peek()) { //if we are in the same level
					if(queue.peek()==null) {
						queue.add(null);level.add(CurrentLevel+1);
					}else {
						queue.add(queue.peek().getLeft());level.add(CurrentLevel+1);
						queue.add(queue.peek().getRight());level.add(CurrentLevel+1);
						previousLevelWasAllNull = false;
					}
					System.out.print(queue.remove() + "  ");level.remove();
				}else { //level has changed
					System.out.println("\n");
					CurrentLevel++;
					if(previousLevelWasAllNull == true) {
						break;
					}
					previousLevelWasAllNull = true;
				}
			}//end of loop
		}//end of method
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
