package CollectionList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class hw19 {

	public static void main(String[] args) {
		
		LinkedList<String> arr = new LinkedList<String>();
		arr.add("red");
		arr.add("blue");
		arr.add("yellow");
		arr.add("pink");
		
		Collections.shuffle(arr);
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
