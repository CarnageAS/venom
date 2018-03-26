
public class MyMauritiusTax implements CalcTax {
	MauritiusTax mt = new MauritiusTax();
	@Override
	public double taxAmount(double price, int qty) {
		// TODO Auto-generated method stub
		double tax = mt.calcTax(price);
		return tax*qty;
	}

}
