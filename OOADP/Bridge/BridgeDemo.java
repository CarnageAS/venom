
public class BridgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new RegularCustomer(new DisSeason1());
		c1.purchaseItem("cycle", 15000.0f);
		c1.purchaseItem("tread mill", 60000.0f);
		c1 = new RegularCustomer(new DiscSeason2());
		c1.purchaseItem("cycle", 15000.0f);
		c1.purchaseItem("tread mill", 60000.0f);
		
	}

}
