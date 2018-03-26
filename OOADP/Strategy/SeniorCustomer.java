
public class SeniorCustomer extends Customer {

	public SeniorCustomer(String id, String name, Discount dsc) {
		super(id, name);
		this.dsc=dsc;
		// TODO Auto-generated constructor stub
	}

	@Override
	void typeOfCustomer() {
		System.out.println("Senior Customer");

	}

}
