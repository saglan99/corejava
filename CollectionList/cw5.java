package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class cw5 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("red");
		arr.add("blue");
		arr.add("yellow");
		arr.add("pink");
		
		arr.set(1, "hello");
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
