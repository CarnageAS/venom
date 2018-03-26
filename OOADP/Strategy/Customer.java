import java.text.DecimalFormat;

public abstract class Customer {
	String id,name;
	Discount dsc;
	DecimalFormat df = new DecimalFormat("0.000");
	Customer(String id,String name){
		this.id=id;
		this.name=name;
	}
	void setDiscountType(Discount dsc) {
		this.dsc=dsc;
	}
	
	abstract void typeOfCustomer();
	void printBill(double amt) {
		double discount = dsc.calcDiscount(amt);
		double billAmount = amt - discount;
		System.out.println(id);
		System.out.println(name);
		System.out.println("Total = "+df.format(billAmount)+" after "+df.format(discount)+" discount");
	}
	
	
}
