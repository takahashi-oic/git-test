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
	public void attack(Monster m){

	}
	public void attack(Character c){

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
