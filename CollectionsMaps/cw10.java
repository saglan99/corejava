package CollectionsMaps;

import java.util.TreeMap;
import java.util.Set;

public class cw10 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> f = new TreeMap<String , Integer>();
		f.put("india1", 91);
		f.put("india2", 92);
		f.put("india3", 93);
		f.put("india4", 94);
		f.put("india5", 95);
		TreeMap<String, Integer> f1 = new TreeMap<String , Integer>();
		
		f1.putAll(f);
		
		Set<String> s=f1.keySet();
		
		for(String a:s)
		{
			System.out.println(a);
			int m = f1.get(a);
			System.out.println(m);
			
		}

	}

}
