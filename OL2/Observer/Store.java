package discount;

import java.util.ArrayList;

public class Store extends Subject {
	ArrayList<Observer> cust = new ArrayList<>();
	float discount;
	@Override
	public void register(Observer o) {
		cust.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int i = cust.indexOf(o);
		if(i>=0) {
			cust.remove(i);
			System.out.println(o+" unregistered successfully" );
		}
			
		
	}

	@Override
	public void notifyObs() {
		for(Observer o:cust) {
			o.update(discount);
		}
	}
	
	void setDiscount(float discount, String reason) {
		System.out.println("Happy "+reason);
		this.discount = discount;
		notifyObs();
	}

}
