package Array;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];
		
		//idexing starts from 0
		
		/*ArrayList ar = new ArrayList();
		ar.add("Apple"); //0
		ar.add("Orange"); //1
		ar.add(1); //2
		ar.add(2); //3
		
		ar.get(0);
		
		String str = (String) ar.get(0); //making object string using casting
		
		System.out.println(str);
		
		Object a1 = ar.get(1); //using objects as it is
		
		System.out.println(a1);
		*/
		
		//using generics
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("mango");
		ar1.add("kiwi");
		ar1.add("null");
		
		System.out.println(ar1.get(0));
		
		//remove method
		ar1.remove(0);
		
		System.out.println(ar1.get(0));
		
		
		LinkedList<Integer>ll = new LinkedList<Integer>();
		
		//can't use int always use Integer
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		ll.remove(0);
		
		for(int x: ll){
			System.out.println(x);
		}
		
	}

}
