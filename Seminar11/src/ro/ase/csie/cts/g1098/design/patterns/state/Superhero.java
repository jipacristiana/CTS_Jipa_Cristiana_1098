package ro.ase.csie.cts.g1098.design.patterns.state;

public class Superhero implements IHero{

	int points;
	String name;
	
	//current state
	HeroStateInterface heroState;
	
	public Superhero(int points, String name) {
		super();
		this.points = points;
		this.name = name;
		//set a default initial state
		this.setState(new NormalState(this));
	}

	@Override
	public void move() {
		this.heroState.walk();
	}

	@Override
	public void defend(int points) {
		this.heroState.losePoints(points);
		
	}

	@Override
	public void heal(int points) {
		this.points = 100 + points;
		this.setState(new NormalState(this));
		
	}

	@Override
	public int getPoints() {
		return this.points;
		
	}

	@Override
	public void removePoints(int points) {
		this.points -= points;
	}

	@Override
	public void setState(HeroStateInterface state) {
		this.heroState = state;
		
	}

}
