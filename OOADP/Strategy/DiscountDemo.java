
public class DiscountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust;
		cust = new RegularCustomer("din01","xyz",new DiscountFTC());
		cust.typeOfCustomer();
		cust.printBill(10000.0);
		cust = new RegularCustomer("din01","xyz",new DiscountRC());
		cust.typeOfCustomer();
		cust.printBill(10000.0);
		cust = new SeniorCustomer("din01","xyz",new DiscountSC());
		cust.typeOfCustomer();
		cust.printBill(10000.0);
		cust.setDiscountType(new DiscountFTC());
		cust.typeOfCustomer();
		cust.printBill(10000.0);
	}

}
