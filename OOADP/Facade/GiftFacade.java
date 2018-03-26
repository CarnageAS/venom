
public class GiftFacade {

	public static void main(String[] args) {
		ItemPurchased it = new ItemPurchased("i1","btwin 320",1,15000.0f);
		//Sports2000ProcessSales ps = new Sports2000ProcessSales(true,it.qty,it.price);
		//ps.processSale();
		Sports2000Facade sf = new Sports2000Facade(it);
	}

}
