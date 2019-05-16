package stack_queues;

public class Stack {	
	static final int MAX = 100; 
	int top;
	int size;
	int[] a = new int[MAX];
	
	boolean isEmpty()
	{
		return (top<0);
	}
	Stack()
	{
		top =-1;
		size =0;
	}
	
	boolean push(int data)
	{
		if(top > (MAX-1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			a[++top] = data;
			size++;
			System.out.println(data + " Instered to Stack and now the size of Stack is "+size);
			return true;
		}
	}
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			int x = a[top--];
			System.out.println(x +" popped from the Stack");
			return x;
		}
	}
	
	void printArray()
	{
		System.out.println("Complete Array");
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	 public static void main(String args[]) 
	    { 
	        Stack s = new Stack(); 
	        s.push(10); 
	        s.push(20); 
	        s.push(30); 
	        s.push(40);
	        s.pop();
	        s.push(50);
	        s.pop();
	        s.pop();
	        s.printArray();
	    } 
}
