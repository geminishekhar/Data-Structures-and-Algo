package dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class linkedlst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al=new ArrayList<Integer>();
		List<Integer> ll=new LinkedList<Integer>();
		
		timediff(al);
		timediff(ll);
		
		

	}
	
	  static void timediff(List<Integer> newlist)
	  {
		  
		  long start=System.currentTimeMillis();
		  for(int i=0;i<100000;i++)
		  {
			  newlist.add(0,i);
		  }
		  long end=System.currentTimeMillis();
		  System.out.println(newlist.getClass().getName()+ " " +(end-start));
	  }

}
