package rpg;

public class SuperHero extends Hero {
	public void SuperHero() {}
	void attack() {}
	public boolean attack( Character c ) {
		super.attack(c);
		return super.attack(c);
	}
	public boolean attack( Monster m ) {
		super.attack(m);
		return super.attack(m);
	}
}