package labQuestion;

public class Trekking extends CategoryODS {

	@Override
	String getDescription() {
		return super.getDescription() + ":"+" Trekking";
	}
	@Override
	int getCurrentStock() {
		return 50;
	}

}
