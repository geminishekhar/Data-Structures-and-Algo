package hashMapsImplimentation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//import com.sun.java.util.jar.pack.ConstantPool.Entry;

public class BasicImplimentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String, Integer> numbersMap=new HashMap<String, Integer>();
       numbersMap.put("one", 1);
       numbersMap.put("two", 2);
       numbersMap.put("three", 3);
       numbersMap.put("four", 4);
       Set<Entry<String,Integer>> entries=numbersMap.entrySet();
       for(Entry<String,Integer> entry:entries)
       {
    	   entry.setValue(entry.getValue()*100);
       }
       
       System.out.println(numbersMap);
	}

}
