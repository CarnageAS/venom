
public class TaxAdapterDemo {
	public static void main(String[] args) {
		Item i1 = new Item("Btwin Rockrider 340",14999.0);
		i1.setQuantity(4);
		i1.setTax(new USTax());
		i1.printPrice();
		i1.setTax(new GST());
		i1.printPrice();
		i1.setTax(new MyMauritiusTax());
		i1.printPrice();
	}

}
