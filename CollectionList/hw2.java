package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class hw2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(3);
		arr.add(19);
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(4);
		arr1.add(2);
		arr1.add(3);
		arr1.add(1);
		
		System.out.println(arr.equals(arr1));

	}

}
