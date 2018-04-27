package labQuestion;

public class AdventureGames extends OutdoorSports {
	String description = super.getDescription() + "->"+"Adventure Games";
	@Override
	String getDescription() {
		// TODO Auto-generated method stub
		return description ;
	}
	@Override
	int getCurrentStock() {
		// TODO Auto-generated method stub
		return 0;
	}

}
