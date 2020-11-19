package CollectionList;


import java.util.LinkedList;

public class hw27 {

	public static void main(String[] args) {
		
		LinkedList<Integer> arr = new LinkedList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		
		LinkedList<Integer> arr1 = new LinkedList<Integer>();
		arr1.add(4);
		arr1.add(2);
		arr1.add(3);
		arr1.add(1);
		
		System.out.println(arr.equals(arr1));

	}

}
