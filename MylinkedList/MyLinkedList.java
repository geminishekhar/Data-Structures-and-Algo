package MylinkedList;

//import org.graalvm.compiler.lir.LIRInstruction.Temp;

//import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class MyLinkedList {
	
	Node head;
	void add(int data)
	{
		Node toAdd= new Node(data);
		Node temp =head;
		if(head==null)
		{
			head=toAdd;
			return;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=toAdd;
		
	}
	
	void  print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

}
