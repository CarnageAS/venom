package labQuestion;

public class Billiards extends Category {
	IndoorSports mainType;
	int stock;
	String description = "Billiards";
	Billiards(IndoorSports mainType, int stock){
		this.mainType = mainType;
		this.stock = stock;
	}
	@Override
	int getCurrentStock() {
		return mainType.getCurrentStock()+stock;
	}
	
	public String getDescription() {
		return mainType.getDescription() + ":"+description;
	}

}
