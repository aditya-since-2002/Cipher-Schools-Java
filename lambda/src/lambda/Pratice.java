package lambda;

import java.util.*;

public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//use of lambda expression
		
		Message m1= ()->{
			System.out.println("Sending a msg");
			
		};
		
		send(m1);
		
		/*send(() -> {
			System.out.println("Sending a msg");
		});*/
		
		
	}

	public static void send(Message msg) {
		msg.sendMessage();
	}
	
}
