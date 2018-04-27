package labQuestion;

public class GamesOnTable extends IndoorSports {
	
	GamesOnTable(String description){
		this.description = super.getDescription()+"->"+ description+":";
	}
	@Override
	int getCurrentStock() {
		return 0;
	}

}
