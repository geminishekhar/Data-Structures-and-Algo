package doubleEndedQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DblEndedQueue<Integer> mydeQueue=new DblEndedQueue<Integer>();
		mydeQueue.addAtHead(12);
		mydeQueue.addAtHead(22);
		mydeQueue.addAtHead(32);
		System.out.println(mydeQueue.removeAtTail());
		System.out.println(mydeQueue.removeAtTail());
	System.out.println(mydeQueue.removeAtTail());

	}

}
