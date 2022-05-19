package ro.ase.csie.cts.g1098.design.patterns.state;

public interface IHero {

	public abstract void move();
	public abstract void defend(int points);
	public abstract void heal(int points);
	public abstract int getPoints();
	public abstract void removePoints(int points);
	public abstract void setState(HeroStateInterface state);
}
