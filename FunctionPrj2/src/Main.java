import java.util.Scanner;

public class Main {
	
	static int fact(int m) {
		int f = 1;
		for (int i=1; i <= m; i++) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {
		int n, r;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n");
		n = scan.nextInt();
		
		System.out.println("Enter r");
		r = scan.nextInt();
		
		// calculates n factorial
		int nfact = fact(n);
		
		// calculates r factorial
		int rfact = fact(r);
		
		// calculates n-r factorial
		int n_rfact = fact(n-r);
		
		// ncr
		
		int result = nfact / (rfact * n_rfact);
		
		System.out.println("Result is - " + result);

	}

}
