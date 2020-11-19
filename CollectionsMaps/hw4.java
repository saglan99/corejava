package CollectionsMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hw4 {

	public static void main(String[] args) {
		
		Map<String, Integer> f = new HashMap<String , Integer>();
		f.put("india1", 91);
		f.put("india2", 92);
		f.put("india3", 93);
		f.put("india4", 94);
		f.put("india5", 95);
		
		System.out.println(f.entrySet());


	}

}
