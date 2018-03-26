
public class Sports2000Facade {
	Sports2000ProcessSales re;
	ItemPurchased it;
	public Sports2000Facade(ItemPurchased it){
		
		this.it=it;
		re = new Sports2000ProcessSales(true, it.qty,it.price);
		re.processSale();
	}
		// TODO Auto-generated constructor stub
	

}
