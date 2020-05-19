package doubleEndedQueue;



public class DblEndedQueue<E> {
	
	Node<E> head, tail;
	
	public  void addAtHead(E data)
	{
		Node<E> addNode=new Node<>(data);
		if (head==null)
		{
			head=tail=addNode;
			return;
		}
		head.next=addNode;
		addNode.prev=head;
		head=addNode;
	}
	
	public E removeAtTail()
	{
		if(head==null)
		{
			tail=null;
			return null;
		}
		Node<E> removeNode=tail;
		tail=tail.next;
		if(tail==null)
		{
			head=null;
			return  removeNode.data;
		}
		tail.prev=null;
		
		
		return  removeNode.data;
		
	}
	
	
				
	
	
	
	
	
	public static class  Node<E> {
		E data;
		Node<E> next,prev;
		
		public Node(E data)
		{
			this.data=data;
			this.prev=null;
			this.next=null;
		}
		
	}

}
