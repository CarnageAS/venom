package discount;

public class DiscountDemo {

	public static void main(String[] args) {
		Store storeNorth = new Store();
		Customer cust1 = new Customer(storeNorth, "xyz");
		Customer cust2 = new Customer(storeNorth, "abc");
		Customer cust3 = new Customer(storeNorth, "pqr");
		storeNorth.setDiscount(10.0f,"New Year");
		storeNorth.unregister(cust2);
		storeNorth.setDiscount(20.0f," Holi");
	}

}
