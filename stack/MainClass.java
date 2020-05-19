package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> mystack=new Stack(); 
		mystack.push(12);
		mystack.push(39);
		System.out.println(mystack.search(39));
		System.out.println(mystack.peek());
		
		
		Queue<Integer> q1=new LinkedList<Integer>(); 


	}

}
