package rpg;
/**
 *
 * @author fujinawa
 *
 */
public class Zombie extends Monster implements Human {

	public boolean attack(Monster m) {
		m.setHp(m.getHp() - 5);
		System.out.println("5のダメージ");

		if(m.dead() == true) {
			return false;
		}
		return true;
	}

	public boolean attack(Character c) {
		c.setHp(c.getHp() - 5);
		System.out.println("5のダメージ");

		if(c.dead() == true) {
			return false;
		}
		return true;
	}

	public void run() {}

	public boolean dead(){
		if( this.getHp() <= -100 ){
			System.out.println("ゾンビ死亡");
			return true;
		}else{
			return false;
		}
	}

	public Zombie(){
		this.setName("ゾンビ");
		this.setHp(100);
		this.setExp(100);
	}

	Zombie(String name){
		this.setName(name);
		this.setHp(100);
		this.setExp(100);
	}

	Zombie(String name,int hp){
		this.setName(name);
		this.setHp(hp);
		this.setExp(100);
	}

}
