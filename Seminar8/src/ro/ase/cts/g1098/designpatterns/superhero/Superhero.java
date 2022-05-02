package ro.ase.cts.g1098.designpatterns.superhero;

public class Superhero implements IACMESuperHero{
	String name;
	int lifepoints;
	
	public Superhero(String name, int lifepoints) {
		super();
		this.name = name;
		this.lifepoints = lifepoints;
	}
	
	@Override
	public void run(int distance) {
		System.out.println(this.name + " is running");
		
	}
	@Override
	public void defend(int points) {
		System.out.println(this.name + " is hit");
		this.lifepoints -= points;
	}
	@Override
	public void heal(int points) {
		System.out.println(this.name + " is healing");
		this.lifepoints += points;
	}
	
	
}
