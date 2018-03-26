
public class USTax implements CalcTax {
	
	@Override
	public double taxAmount(double price, int qty) {
		// TODO Auto-generated method stub
		double tax = price*qty*0.1f;
		return tax;
	}

}
