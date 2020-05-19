package dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ArrLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList arrayList =new ArrayList();
//		arrayList.add("Shekhar");
//		arrayList.add("Yadav");
//		System.out.println(arrayList);
//		Double double1=24.5;
//		
//		Pair<String,Integer > p1=new Pair("Shekhar", 4012);
//		Pair<Integer,Integer > p2=new Pair("Shekhar", 4.45);
//		System.out.println(p1.a);
//		System.out.println(p2.a);
		List<String> fruits=new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Grapes");
		List<String> vegList=new LinkedList<String>();
		vegList.add("Potato");
		vegList.add("Tomato");
		fruits.addAll(vegList);
		System.out.println(fruits);
		

	}

}
