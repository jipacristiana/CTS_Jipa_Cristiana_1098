package ro.ase.csie.cts.g1098.design.patterns.state;

public class Main {

	public static void main(String[] args) {

		IHero superhero = new Superhero(150, "Superwoman");
		superhero.move();
		superhero.defend(30);
		superhero.move();
		superhero.defend(30);
		superhero.move();
		superhero.defend(50);
		superhero.move();
		superhero.heal(50);
		superhero.move();

	}

}
