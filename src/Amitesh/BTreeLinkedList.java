package Amitesh;

import java.util.LinkedList;
import java.util.Queue;

import node.BinaryNode;

public class BTreeLinkedList {
	
	BinaryNode root;
	
	
	public BTreeLinkedList()
	{
		this.root=null;
	}
	
	
	
	public void insert(int value)
	{
		BinaryNode node=new BinaryNode();
		
		node.setValue(value);
		
		if(root==null)
		{
			root=node;
			System.out.println("Successfully inserted  "+value +  " root");
			return;
		}
		
		else
		{
			Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
			
			queue.add(root);
			
			while(!queue.isEmpty())
			{
				BinaryNode presentNode=queue.remove();
				
				if(presentNode.getLeft()==null)
				{
					presentNode.setLeft(node);
					System.out.println("Successfully inserted new node in left!");
					break;
				}
				
				else if(presentNode.getRight()==null)
				{
					presentNode.setRight(node);
					System.out.println("Successfully inserted new node in right!");
					break;
				}
				
				else
				{
					queue.add(presentNode.getLeft());
					queue.add(presentNode.getRight());
				}
				
				
			}
		}
	}
	
	
	public void search(int value)
	{
		
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		
		queue.add(root);
		
	
		
		while(!queue.isEmpty())
		{
			BinaryNode presentNode=queue.remove();
			
			if(presentNode.getValue()==value)
			{
				System.out.println("Value-"+value+" is found in Tree !");
				return;
			}
			
			else
			{
				if(presentNode.getLeft()!=null)
				{
					queue.add(presentNode.getLeft());
				}
				
				if(presentNode.getRight()!=null)
				{
					queue.add(presentNode.getRight());
				}
				
				
			}
			
			
		}
		System.out.println("Value-"+value+" is not found in Tree !"); 

		
	}
	
	
	public BinaryNode getDeepestNOde()
	{
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		
		BinaryNode presentnode=null;
		
		while(!queue.isEmpty())
		{
			presentnode=queue.remove();
			
			if(presentnode.getLeft()!=null)
			{
				queue.add(presentnode.getLeft());
			}
			
			if(presentnode.getRight()!=null)
			{
				queue.add(presentnode.getRight());
			}
			
		}
		
		return presentnode;
	}
	
	// delete node from binary tree
		void deleteNodeOfBinaryTree(int value) {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryNode presentNode = queue.remove();
				// if node is found then copy deepest node here and delete deepest node.
				if (presentNode.getValue() == value) {
					presentNode.setValue(getDeepestNOde().getValue());
					DeleteDeepestNode();
					System.out.println("Deleted the node !!");
					return;
				}else {
					if (presentNode.getLeft() != null)
						queue.add(presentNode.getLeft());
					if (presentNode.getRight() != null)
						queue.add(presentNode.getRight());
				}
			}//end of while loop
			System.out.println("Did not find the node!!");
		}
		
		public void preorder(BinaryNode node)
		{
			if(node==null)
			{
				return;
			}
			
			else
			{
				System.out.print(node.getValue() + " ");
				preorder(node.getLeft());
				preorder(node.getRight());
			}
			
			
		}
		
		public void postorder(BinaryNode node)
		{
			if(node==null)
			{
				return;
			}
			
			else
			{
				postorder(node.getLeft());
				postorder(node.getRight());
				
				System.out.print(node.getValue() + " ");
			}
		}
	
	public void DeleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode previousNode, presentNode = null;
		while (!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if (presentNode.getLeft() == null) {
				previousNode.setRight(null);
				return;
			}else if ((presentNode.getRight() == null)) {
				presentNode.setLeft(null);
				return;
			}
			queue.add(presentNode.getLeft());
			queue.add(presentNode.getRight());
		}//end of while loop
	}//end of method
	
	void levelOrder() {
		// make a queue for level order. Queue is Interface and LinkedList is class
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.getValue() + " ");
			if (presentNode.getLeft() != null) {
				queue.add(presentNode.getLeft());
			}
			if (presentNode.getRight() != null)
				queue.add(presentNode.getRight());
		}
		
		System.out.println();
	}// end of method 

}
