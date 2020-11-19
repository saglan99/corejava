package CollectionSets;

import java.util.Iterator;
import java.util.TreeSet;

public class hw5 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("red");
		set.add("yellow");
		set.add("black");
		set.add("orange");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String a = it.next();
			System.out.println(a);
		}
		
	}

}
