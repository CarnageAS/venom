
public class RegularCustomer extends Customer {

	RegularCustomer(String id, String name,Discount dsc) {
		super(id, name);
		this.dsc = dsc;
		// TODO Auto-generated constructor stub
	}

	@Override
	void typeOfCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Regular Customer");

	}

}
