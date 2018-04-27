package myAbstractFactory;

public class DiffAbledSportsFactory implements SportsFactory {

	@Override
	public OutDoorAdventure getOutDoorAdvSport() {
		// TODO Auto-generated method stub
		return new ParaGlidingDiffAbled();
	}

	@Override
	public OutDoorRegular getOutDoorRegSport() {
		// TODO Auto-generated method stub
		return new CricketDiffAbled();
	}

}
