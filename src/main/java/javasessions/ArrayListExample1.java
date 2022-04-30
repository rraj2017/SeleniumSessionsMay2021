package javasessions;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		//to add some colours in the list and print the collection
		ArrayList arr = new ArrayList();
		arr.add("Red");
		arr.add("Blue");
		arr.add("Green");
		arr.add("Yellow");
		arr.add("Black");
		arr.add("Orange");
		
	//     arr.add(0, "white");
	    // arr.remove(0);
	     arr.set(1, "Magneta");
		
		System.out.println(arr.size());
		for(int i =0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		if(arr.contains("Blue")) {
			System.out.println("Blue is there");
		}
		else {
			System.out.println("Blue is not in the list");
		}
		
		
		
	}

}
