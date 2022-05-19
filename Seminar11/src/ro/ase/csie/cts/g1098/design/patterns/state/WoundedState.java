package ro.ase.csie.cts.g1098.design.patterns.state;

public class WoundedState implements HeroStateInterface {
	IHero hero;

	public WoundedState(IHero hero) {
		super();
		this.hero = hero;
	}

	@Override
	public void walk() {
		System.out.println("Is walking slowly!");
		
	}

	@Override
	public void losePoints(int points) {
		hero.removePoints(points);
		if(this.hero.getPoints() <50)
			this.hero.setState(new CriticalState(this.hero));
		
	}
}
