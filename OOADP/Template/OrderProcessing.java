public abstract class OrderProcessing {
	abstract Item selectItem();
	abstract String doPayment(Item item);
	abstract void doDelivery();
	
	void purchase() {
		Item item = selectItem();
		System.out.println(doPayment(item));
		doDelivery();
	}
}