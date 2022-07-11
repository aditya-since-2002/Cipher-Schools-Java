// Variable arguments

class Sample {
	
	public int sum(int ... a) {
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}

	public int sum(int a, int b) {
		return a + b;
	}
	
}


public class Main {

	public static void main(String[] args) {
		Sample obj = new Sample();
		
		int x = obj.sum(10, 20, 30, 40);
		System.out.println("Result is " + x);
		System.out.printf("x is %d", x);

		int y = obj.sum(10, 20);
		System.out.println(y);
		
	}

}
