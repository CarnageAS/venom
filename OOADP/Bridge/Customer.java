
public abstract class Customer {
	abstract float getDiscount(String name);
	void purchaseItem(String name, float price) {
		float discount = getDiscount(name)*price;
		float aPrice = price-discount;
		System.out.println(name);
		System.out.println("Price = "+price);
		System.out.println("Discount = "+discount+"("+getDiscount(name)+"%)");
		System.out.println("Final Price="  + aPrice);
	}
}
