package CollectionsMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hw6 {

	public static void main(String[] args) {
		
		Map<String, Integer> f = new HashMap<String , Integer>();
		f.put("india1", 91);
		f.put("india2", 92);
		f.put("india3", 93);
		f.put("india4", 94);
		f.put("india5", 95);
		
		Set<String> s=f.keySet();
		
		for(String p:s)
		{
			System.out.println(p);
		}

	}

}
