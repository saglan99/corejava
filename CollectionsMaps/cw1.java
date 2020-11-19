package CollectionsMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class cw1 {

	public static void main(String[] args) {
		
		Map<String, Integer> f = new HashMap<String , Integer>();
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
