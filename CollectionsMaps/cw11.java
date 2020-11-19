package CollectionsMaps;

import java.util.Set;
import java.util.TreeMap;

public class cw11 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> f = new TreeMap<String , Integer>();
		f.put("india1", 91);
		f.put("india2", 92);
		f.put("india3", 93);
		f.put("india4", 94);
		f.put("india5", 95);
		
		Set<String> s = f.keySet();
		
		for(String p:s)
		{
			System.out.println(p);
		}
		

	}

}
