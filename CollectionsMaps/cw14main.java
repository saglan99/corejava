package CollectionsMaps;

import java.util.TreeMap;

public class cw14main {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> f = new TreeMap<String , Integer>(new cw14());
		f.put("india1", 91);
		f.put("india2", 92);
		f.put("india3", 93);
		f.put("india4", 94);
		f.put("india5", 95);
		
		System.out.println(f);
		
	}

}
