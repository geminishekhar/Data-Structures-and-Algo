package set;

import java.util.HashSet;
import java.util.Set;

public class SetDataStructures {

	public static void main(String[] args) {
		Set<Integer> x= new HashSet<Integer>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		
		Set<Integer> y= new HashSet<Integer>();
		y.add(1);
		System.out.println(x.containsAll(y));
		System.out.println(x.retainAll(y));
		x.addAll(y);
		System.out.println(x);
		
		

	}

}
