package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class hw20 {

	public static void main(String[] args) {
		
		LinkedList<String> arr = new LinkedList<String>();
		arr.add("red");
		arr.add("blue");
		arr.add("yellow");
		arr.add("pink");
		
		LinkedList<String> arr1 = new LinkedList<String>();
		arr.add("red");
		arr.add("blue");
		arr.add("yellow");
		arr.add("pink");
		
		arr.addAll(0, arr1);
		
		System.out.println(arr);

	}

}
