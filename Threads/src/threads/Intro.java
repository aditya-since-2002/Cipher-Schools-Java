package threads;

import java.util.*;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t1 = new Task("First thread");
		t1.start();
		//same thread should not be used again
		
		Task t2 = new Task("Second thread");
		t2.start();

		
		
	}

}


class Task extends Thread{
	
	String name;
	
	public Task(String name) {
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