package ro.ase.cts.g1098.designpatterns.weapons;

public interface IWeapon extends Cloneable {

	public abstract void shoot();
	public abstract void reload(int ammo);
}