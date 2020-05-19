package myPriorityQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;



public class MyPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Deque<Integer> dqDeque= new LinkedList<Integer>();
		dqDeque.isEmpty();
		dqDeque.peekFirst();
		dqDeque.peekLast();
		dqDeque.removeFirst();
		dqDeque.removeLast();
//		dqDeque.add(e)
		
		
		PriorityQueue<Integer> mypq=new PriorityQueue<Integer>();
         mypq.add(62);
         mypq.add(72);
         mypq.add(32);
         mypq.add(22);
         
         System.out.println(mypq);
         System.out.println(mypq.remove());
         System.out.println(mypq.remove());
         System.out.println(mypq.remove());
         System.out.println(mypq.remove());
	}

}
