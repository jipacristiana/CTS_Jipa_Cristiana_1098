package ro.ase.cts.g1098.designpatterns.disneyhero;

import ro.ase.cts.g1098.designpatterns.superhero.IACMESuperHero;

public class Disney2AcmeAdapter implements IACMESuperHero {

	IDisneyHero disneyHero;
	
	public Disney2AcmeAdapter(IDisneyHero disneyHero) {
		super();
		this.disneyHero = disneyHero;
	}

	@Override
	public void run(int distance) {
		int defaultSpeed = 10;
		this.disneyHero.move(distance, defaultSpeed);
		
	}

	@Override
	public void defend(int points) {
		if(this.disneyHero instanceof DisneyHero) {
			DisneyHero hero = (DisneyHero)this.disneyHero;
			System.out.println(hero.heroname + "is defending");
			hero.points -= points;
		}
		
	}

	@Override
	public void heal(int points) {
		this.disneyHero.recoverPoints(points);
		
	}
}
