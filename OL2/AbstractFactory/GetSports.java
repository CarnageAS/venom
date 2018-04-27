package myAbstractFactory;

public class GetSports {
	public static void main(String[] args) {
		SportsFactory myFactory = new DiffAbledSportsFactory();
		System.out.println(myFactory.getOutDoorAdvSport().getSportsName());
		System.out.println(myFactory.getOutDoorRegSport().getSportsName());
		
		myFactory.getOutDoorAdvSport().displayProducts();
		myFactory = new RegularSportsFactory();
		System.out.println(myFactory.getOutDoorAdvSport().getSportsName());
		System.out.println(myFactory.getOutDoorRegSport().getSportsName());
	}
	
	
}
