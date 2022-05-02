package ro.ase.cts.g1098.designpatterns.main;

import ro.ase.cts.g1098.designpatterns.disneyhero.Disney2AcmeAdapter;
import ro.ase.cts.g1098.designpatterns.disneyhero.DisneyHero;
import ro.ase.cts.g1098.designpatterns.disneyhero.IDisneyHero;
import ro.ase.cts.g1098.designpatterns.superhero.IACMESuperHero;
import ro.ase.cts.g1098.designpatterns.superhero.Superhero;
import ro.ase.cts.g1098.designpatterns.weapons.Bazooka;
import ro.ase.cts.g1098.designpatterns.weapons.IWeapon;
import ro.ase.cts.g1098.designpatterns.weapons.MachineGun;
import ro.ase.cts.g1098.designpatterns.weapons.Pistol;
import ro.ase.cts.g1098.designpatterns.weapons.WeaponType;
import ro.ase.cts.g1098.designpatterns.weapons.WeaponsFactory;

public class Main {

	public static void main(String[] args) {
		
		//using weapons without the factory
		IWeapon weapon = new Pistol("Water pistol", true);
		//IWeapon seconWweapon = new MachineGun("Ultimate rifle", 100, 100);
		//IWeapon thirdWeapon = new Bazooka("Rocket", 100);
		
		IWeapon anotherWeapon = WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "Army");
		((Bazooka)anotherWeapon).setMaxDistance(2000);
		
		IACMESuperHero superman = new Superhero("Superman", 100);
		IDisneyHero vader = new DisneyHero("Vader");
		
		IACMESuperHero vaderhero = new Disney2AcmeAdapter(vader);
		
		vaderhero.heal(100);
		vaderhero.run(200);
		
		IACMESuperHero luke = new Disney2AcmeAdapter(new DisneyHero("Luke"));
		

	}

}
