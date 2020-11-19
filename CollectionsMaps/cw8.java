package CollectionsMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class cw8 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> f = new TreeMap<String , Integer>();
		f.put("india1", 91);
		f.put("india2", 92);
		f.put("india3", 93);
		f.put("india4", 94);
		f.put("india5", 95);
		
		Set<String> s=f.keySet();
		
		for(String a:s)
		{
			System.out.println(a);
			int m = f.get(a);
			System.out.println(m);
			
		}
		
		

	}

}
