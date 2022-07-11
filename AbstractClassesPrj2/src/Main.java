// Abstract class and Concrete class

abstract class Base {
	public abstract void f();
	public abstract void g();
	
	public void h() {
		System.out.println("h() in Base");
	}
}

abstract class Derived extends Base {
	
	public void f() {
		System.out.println("f() in Derived");
	}
}

class Derived1 extends Derived {
	
	public void g() {
		System.out.println("g() in Derived1");
	}
}

public class Main {

	public static void main(String[] args) {
		Base b; // ref var
		Derived d1; // ref var
		Derived1 d2; // ref var
		
		b = new Derived1();
		d1 = new Derived1();
		d2 = new Derived1();
		
		b.f();
		b.g();
		b.h();
		
		d1.f();
		d1.g();
		d1.h();
		
		d2.f();
		d2.g();
		d2.h();
		
		
	}

}
