package myAbstractFactory;


public class ParaGlidingDiffAbled extends OutDoorAdventure{
	OutDoorAdvProducts odap;
	public ParaGlidingDiffAbled() {
		odap = new PGDiffAbled();
	}
	@Override
	String getSportsName() {
		return "ParaGliding - Differently Abled";
	}
	
	@Override
	void displayProducts() {
		odap.displayProducts();
	}

}
