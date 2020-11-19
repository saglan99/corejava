package CollectionList;

import java.util.ArrayList;
import java.util.LinkedList;

public class hw21 {

	public static void main(String[] args) {
		
		LinkedList<Integer> arr = new LinkedList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(3);
		arr.add(19);
		
		LinkedList<Integer> arr1 = new LinkedList<Integer>();
		arr1=(LinkedList<Integer>) arr.clone();
		
		System.out.println(arr1);

	}

}
