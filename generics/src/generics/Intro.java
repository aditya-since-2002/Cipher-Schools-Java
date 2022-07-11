package generics;

import java.util.*;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ArrayList arr = new ArrayList();
		
		arr.add(1);
		arr.add("manho");
		arr.add(3);
		arr.add("apple");
		
		String str = (String)arr.get(1);
		
		System.out.println(str);
		*/
		
		/*Generic o1= new Generic(1,2);
		
		o1.get1();*/
		
		Generic<Integer, Integer> o1 = new Generic<Integer,Integer>(100,100);
		
		int x = o1.get1();
		
		//System.out.println(x);
		
		ArrayList<Integer>a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		ArrayList<Integer>a2 = new ArrayList<>();
		a2.add(20);
		a2.add(25);
		a2.add(30);
		
		ArrayList<Integer> ans = fxn(a1,a2);
		
		//for loop, for each, iterator
		
		Iterator<Integer> it=ans.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static <E> ArrayList<E> fxn(ArrayList<E>a1, ArrayList<E>a2){
		ArrayList<E>ans = new ArrayList<>();
		ans.addAll(a1);
		ans.addAll(a2);
		return ans;
	}

}
