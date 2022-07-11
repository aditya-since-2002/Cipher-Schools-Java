package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedHashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* HashSet<Integer>set = new HashSet<Integer>(); //only prints unuique values
		LinkedHashSet<Integer>set1 = new LinkedHashSet<Integer>(); //print in order as inserted
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5);
		
		set1.add(10);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(5);

		for(Integer x:set) {
			System.out.println(x);
		}
		
		for(Integer y:set1) {
			System.out.println(y);
		}*/
		HashSet<Smartphone>set = new HashSet<Smartphone>();
		
		set.add(new Smartphone("Apple","ipjone",50000));
		set.add(new Smartphone("plus","one",480000));
		set.add(new Smartphone("le","eno",540000));
		set.add(new Smartphone("Apple","ipjone",50000));
		
		for(Smartphone x:set) {
			System.out.println(x);
		}
	}

}
