import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double billAmount, netAmount;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter bill amount");
		billAmount = scan.nextDouble();
		
		if (billAmount > 1000) {
			netAmount = billAmount * 0.9;
		} else {
			netAmount = billAmount * 0.95;
		}
		
		System.out.println("Net amount is " + netAmount);

	}

}
