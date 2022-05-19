package ro.ase.csie.cts.g1098.design.patterns.state;

public class CriticalState implements HeroStateInterface{
	IHero hero;
	
	public CriticalState(IHero hero) {
			super();
			this.hero = hero;
		}

	@Override
	public void walk() {
		System.out.println("Is laying down!");
		
	}

	@Override
	public void losePoints(int points) {
		hero.removePoints((int) (points *1.1));
		if(this.hero.getPoints() <= 0)
			System.out.println("Game over");
	}
}
