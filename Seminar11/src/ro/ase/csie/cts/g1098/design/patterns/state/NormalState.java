package ro.ase.csie.cts.g1098.design.patterns.state;

public class NormalState implements HeroStateInterface{

	IHero hero;
	
	
	public NormalState(IHero hero) {
		super();
		this.hero = hero;
	}

	@Override
	public void walk() {
		System.out.println("Is running!");
		
	}

	@Override
	public void losePoints(int points) {
		hero.removePoints(points);
		if(this.hero.getPoints() <100)
			this.hero.setState(new WoundedState(this.hero));
	}

}
