package CollectionList;

import java.util.ArrayList;

public class hw4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(3);
		arr.add(19);
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1=(ArrayList<Integer>) arr.clone();
		
		System.out.println(arr1);

	}

}
