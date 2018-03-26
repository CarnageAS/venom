
public class RegularCustomer extends Customer {
	Discount dis;
	RegularCustomer(Discount dis){
		this.dis = dis;
	}
	@Override
	float getDiscount(String name) {
		// TODO Auto-generated method stub
		return dis.slab(name);
	}

}
