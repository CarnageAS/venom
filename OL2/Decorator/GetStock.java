package labQuestion;

public class GetStock {

	public static void main(String[] args) {
		IndoorSports got = new GamesOnTable("Games on Table");
		got = new TableTennis(got, 100);
		System.out.println(got.getDescription()+"\n"+got.getCurrentStock());

		got = new Billiards(got, 50);
		System.out.println(got.getDescription()+"\n"+got.getCurrentStock());
		
		got = new Billiards(got, 100);
		System.out.println(got.getDescription()+"\n"+got.getCurrentStock());
		
		OutdoorSports advGames = new AdventureGames();
		System.out.println(advGames.getDescription()+"\nStock "+advGames.getCurrentStock());
		advGames = new Trekking();
		System.out.println(advGames.getDescription()+"\nStock "+advGames.getCurrentStock());
	}	

}
