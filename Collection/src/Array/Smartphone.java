package Array;

public class Smartphone {

	String brand;
	String Modelname;
	int price;
	
	public Smartphone(String brand, String Modelname, int price) {
		
		this.brand = brand;
		this.Modelname = Modelname;
		this.price = price;
		
	}
	
	@Override
	public String toString() {
		return brand+" "+Modelname+" "+price;
	}
}
