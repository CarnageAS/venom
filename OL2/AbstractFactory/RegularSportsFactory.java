package myAbstractFactory;

public class RegularSportsFactory implements SportsFactory {

	@Override
	public OutDoorAdventure getOutDoorAdvSport() {
		// TODO Auto-generated method stub
		return new ParaGliding();
	}

	@Override
	public OutDoorRegular getOutDoorRegSport() {
		// TODO Auto-generated method stub
		return new Cricket();
	}

}
