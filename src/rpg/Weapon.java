package rpg;
/**
*
* @author fujinawa
*
*/
public abstract class Weapon {
	private String name;
	private int power;

	public void Throw(){}

	public void attack(){}
	public boolean attack(Monster m){
		return false;
	}
	public boolean attack(Character c){
		return false;

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
}
