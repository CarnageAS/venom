
public class GST implements CalcTax {

	@Override
	public double taxAmount(double price, int qty) {
		// TODO Auto-generated method stub
		return price*qty*0.18f;
	}

}
