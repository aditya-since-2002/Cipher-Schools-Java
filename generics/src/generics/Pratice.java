package generics;

import java.util.*;

public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o1 = new Object();
		
		//object calss is parent class of all classes in java
		
		String str = "apple";
		o1 = str;
		
		
		ArrayList<Object>arr1 =new ArrayList<>();
		ArrayList<String>arr2 = new ArrayList<>();
		
		ArrayList<?>arr3 = new ArrayList<>();
		arr3 = arr2;
		
		
	}

}
