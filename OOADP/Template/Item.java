public class Item {
	int id;
	String type;
	String name;
	String brand;
	double price;
	
	Item(){
		id=0;
		type="";
		name="";
		brand="";
		price=0;
	}
	
	Item(int  id,String type, String name, String brand, double price){
		this.id=id;
		this.type=type;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	
	public String toString() {
		String pid="ID: "+id+"\n";
		String pname="Name: "+name+"\n";
		String ptype="Type: "+type+"\n";
		String pbrand="Brand: "+brand+"\n";
		String pprice="Price: "+price+"\n";
	//	return "how i want my object to be displayed";
		return (pid+pname+ptype+pbrand+pprice);
	}
}