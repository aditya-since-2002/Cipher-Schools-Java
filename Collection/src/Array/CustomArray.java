package Array;

import java.util.ArrayList;

public class CustomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ArrayList<String>arr = new ArrayList<String>();
		
		arr.add("Mago");
		arr.add("Apple");
		arr.add("gauva");
		arr.add("banaana");
		
		for(int i = 0;i<arr.size();i++) {
			System.out.println(arr);
		}
		
		//for each loop
		for(String arr1:arr) {
			System.out.println(arr);
		}
		*/
		ArrayList<Smartphone>phones = new ArrayList<Smartphone>();
		
		phones.add(new Smartphone("Apple","Ipjhne",40000));
		phones.add(new Smartphone("Apple","Ipjhne",60000));
		
		for(Smartphone p1: phones) {
			System.out.println(p1);
		}
	}

}
