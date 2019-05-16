package trees;

public class BinarySearchTree {
	
	Node root;
	BinarySearchTree()
	{
		root = null;
	}

	void insert(int key)
	{
		root =insertRec(root, key);
	}
	
	void deleteKey(int key)
	{
		root = deleteRec(root, key);
	}
	private Node deleteRec(Node root, int key) {
		
		if(root ==null)
		{
			return root;
		}
		if(key < root.key)
		{
			root.left = deleteRec(root.left, key);
		}
		else if(key > root.key)
		{
			root.right = deleteRec(root.right, key);
		}
		else
		{
			if(root.left ==null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.key = minValue(root.right);
			root.right = deleteRec(root.right, root.key);
		}
		return root;
	}
	int minValue(Node root) 
    { 
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    } 

	Node insertRec(Node root, int key)
	{
		if(root == null)
		{
			root = new Node(key);
		}
		if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        return root;
	}
	void printInOrder(Node node) {
		if (node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.print(node.key + " ");
		printInOrder(node.right);
	}
	void printInorder() {
		printInOrder(root);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
  
        System.out.println("Inorder traversal of the given tree"); 
        tree.printInorder(); 
  
        System.out.println("\nDelete 20"); 
        tree.deleteKey(20); 
        System.out.println("Inorder traversal of the modified tree"); 
        tree.printInorder(); 
  
        System.out.println("\nDelete 30"); 
        tree.deleteKey(30); 
        System.out.println("Inorder traversal of the modified tree"); 
        tree.printInorder(); 
  
        System.out.println("\nDelete 50"); 
        tree.deleteKey(50); 
        System.out.println("Inorder traversal of the modified tree"); 
        tree.printInorder(); 
		
	}

}
