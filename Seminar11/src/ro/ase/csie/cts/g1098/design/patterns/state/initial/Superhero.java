package ro.ase.csie.cts.g1098.design.patterns.state.initial;

public class Superhero implements IHero{

	int points;
	String name;
	
	
	public Superhero(int points, String name) {
		super();
		this.points = points;
		this.name = name;
	}

	@Override
	public void move() {
		if(this.points > 100)
		{
			System.out.println("Is running!");  //we ignore now magic numbers(clean coding) because we don t have time but at the hw don t do that
		}
		if(this.points < 100 && this.points >= 50) 
		{
			System.out.println("Is moving slowly");
		}
		if(this.points < 50)
		{
			System.out.println("Is not moving");
		}
	}

	@Override
	public void defend(int points) {
		if(this.points < 50)
		{
			this.points -= (points* 1.1);
		}
		
	}

	@Override
	public void heal(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPoints() {
		return this.points;
		
	}

}
