package linkedList;

public class LinkedList {
	
	static Node head;
	static int size;
	
	Node[] n = new Node[6];
	
	public void printNodeArray()
	{
		for(int i=0;i<6;i++)
		{
			n[i].data = i*10;
		}
	}
	public void addFromFront(int data)
	{
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
		size++;
	}
	public void addAfterAGivenNode(Node n, int data)
	{
		if(n == null)
		{
			System.out.println("Null Node Provided");
		}
		
		Node new_node = new Node(data);
		
		Node temp = n.next;
		n.next = new_node;
		new_node.next = temp;
		
	}
	
	public void addAtTheEnd(int data)
	{
		Node new_node = new Node(data);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		new_node.next = null;
		
		Node last = head;
		while(last.next != null)
		{
			last = last.next;
		}
		
		last.next = new_node;
		return;
	}
	public void printlist()
	{
		Node temp = head; 
		System.out.print("head ->");
        while (temp != null) 
        { 
           System.out.print(temp.data+" -> "); 
           temp = temp.next; 
        }
        System.out.println("null");
	}
	public Node removeFromFront()
	{
		if(isEmpty())
		{
			return null;
		}
		Node removenode = head;
		head = head.next;
		size--;
		return removenode;
	}
	public void removeAGivenKey(int key)
	{
		Node tmp = head, prev = null;
		
		if(tmp.next == null && tmp.data ==key)
		{
			head = tmp.next;
			return;
		}
		
		while(tmp != null && tmp.data != key)
		{
			prev = tmp;
			tmp = tmp.next;
		}
		
		if(tmp == null)
		{
			return;
		}
		
		prev.next = tmp.next;
	}
	public boolean isEmpty()
	{
		return head == null;
	}
	public static void main(String args[])
	{
		LinkedList ll = new LinkedList();
		System.out.println(ll.isEmpty());
		ll.addFromFront(10);
		ll.addFromFront(20);
		ll.addFromFront(30);
		ll.addAfterAGivenNode(head.next, 25);
		ll.printlist();
		ll.removeAGivenKey(20);
		ll.printlist();
//		ll.addAtTheEnd(45);
//		ll.addFromFront(76);
//		
//		ll.printlist();
//		ll.removeFromFront();
//		ll.removeFromFront();
		System.out.println(ll.isEmpty());
		ll.printlist();
		System.out.println(size);
	}
	

}
