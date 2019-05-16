package stack_queues;

public class StackasLinkedList {
	StackNode root;
	
	static class StackNode{
		int data;
		StackNode next;
		
		StackNode(int data)
		{
			this.data = data;
		}
	}
	
	public boolean isEmpty()
	{
		return (root ==null);
	}
	
	public void push(int data)
	{
		StackNode newNode = new StackNode(data); 
		  
        if (root == null) { 
            root = newNode; 
        } else { 
            newNode.next = root;
            root = newNode;
        } 
        System.out.println(data + " pushed to stack");
	}
	
	public StackNode pop()
	{
		if(isEmpty())
		{
			return null;
		}
		else
		{
			StackNode remove = root;
			root = root.next;
			System.out.println(remove.data +" popped from the Stack");
			return remove;
			
		}
	}
	   public int peek() { 
	        if (root == null) { 
	            System.out.println("Stack is empty"); 
	            return Integer.MIN_VALUE; 
	        } else { 
	            return root.data; 
	        } 
	          
	    }
	   
	   public static void main(String args[]) 
	    { 
		   StackasLinkedList s = new StackasLinkedList(); 
	        s.push(10); 
	        s.push(20); 
	        s.push(30); 
	        s.push(40);
	        s.pop();
	        s.push(50);
	        s.pop();
	        s.pop();
	       System.out.println(s.peek() + " is at top of Stack right now");
	    } 

}
