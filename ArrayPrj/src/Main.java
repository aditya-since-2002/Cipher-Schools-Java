
public class Main {

	public static void main(String[] args) {
		int a[] = {10, 5, 15, 6, 41, 3};
		
		int big = a[0];
		
		for( int value : a ) {
			if ( value > big ) {
				big = value;
			}
		}
		
		System.out.println("Biggest is " + big);

	}

}
