package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;


public class Custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>x= new ArrayList<>();
		ArrayList<Integer>y= new ArrayList<>();
		
		x.add(1);
		x.add(2);
		x.add(3);
		
		y.add(10);
		y.add(11);
		y.add(12);
		
		x.addAll(y);
		
		System.out.println(x);
		
		y.addAll(x);
		
		System.out.println(y);

		
	}

}
