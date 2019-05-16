package stack_queues;

import linkedList.Node;

public class QueueLinkedList {

	Node front, rear;

	public QueueLinkedList() {
		this.front = this.rear = null;
	}

	void enqueue(int data) {
		Node newnode = new Node(data);
		if (rear == null) {
			front = rear = newnode;
			return;
		} else {
			rear.next = newnode;
			rear = newnode;
		}
	}

	Node dequeue() {
		if (front == null) {
			return null;
		}
		Node temp = front;
		front = front.next;
		if (front == null)
			rear = null;
		return temp;
	}
	
	 public static void main(String[] args)  
	    { 
		 QueueLinkedList q=new QueueLinkedList(); 
	        q.enqueue(10); 
	        q.enqueue(20); 
	        q.dequeue(); 
	        q.dequeue(); 
	        q.enqueue(30); 
	        q.enqueue(40); 
	        q.enqueue(50); 
	          
	        System.out.println("Dequeued item is "+ q.dequeue().data); 
	    } 

}
