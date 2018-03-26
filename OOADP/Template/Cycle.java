import java.util.ArrayList;
import java.util.Iterator;

public class Cycle implements Menu {
	String s = "cycling";
	ArrayList<Item> al = new ArrayList<Item>();
	@Override
	public void displayMenu() {
		
		al.add(new Item(1,"Sports","ABC","Hero",3000));
		al.add(new Item(2,"Fancy","def","Mbike",5000));
		al.add(new Item(3,"Durable","Modi","BJP",15000));
		al.add(new Item(4,"Ecofriendly","Trump","AAP",50000));
		
		Iterator<Item> itr = al.iterator();
		//int i=1;
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}