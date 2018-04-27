package discount;

public class Customer implements Observer {
	Store x;
	String name;
	Customer(Store x, String name){
		this.x = x;
		x.register(this);
		this.name = name;
		
	}
	@Override
	public void update(float discount) {
		System.out.println(this + ": you have dicsount of - "+discount+"%");
	}
	
	public String toString() {
		return name;
	}
}
