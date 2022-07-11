package threads;

import java.util.*;

public class Implemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 t1 = new Task1("First thread");
		//same thread should not be used again
		t1.run();
		
		
		Task1 t2 = new Task1("Second thread");
		t2.run();
		
		
	}

}


class Task1 implements Runnable{
	
	String name;
	
	public Task1(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i=0;i<100;i++) {
			System.out.println("i= "+i+" "+Thread.currentThread().getName());
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}