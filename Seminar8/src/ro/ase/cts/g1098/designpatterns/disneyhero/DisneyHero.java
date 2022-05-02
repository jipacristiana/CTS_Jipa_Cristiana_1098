package ro.ase.cts.g1098.designpatterns.disneyhero;

public class DisneyHero implements IDisneyHero{

	String heroname;
	int points = 100;
	
	
	public DisneyHero(String heroname) {
		super();
		this.heroname = heroname;
	}
	
	@Override
	public void recoverPoints(int points) {
		System.out.println("recover points");
		
	}
	
	@Override
	public void move(int distance, float speed) {
		System.out.println("Move");
		
	}
}
