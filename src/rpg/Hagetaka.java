package rpg;
/**
*
* @author fujinawa
*
*/
public class Hagetaka extends Monster implements Bird {

	public void attack(Monster m) {
		m.setHp(m.getHp() - 5);
		System.out.println("5のダメージ");
	}

	public void attack(Character c) {
		c.setHp(c.getHp() - 5);
		System.out.println("5のダメージ");
	}

	public void run() {}
	public void fly() {}

	/*public void dead(){
		System.out.println("ハゲタカは地に落ちた");
	}*/

	public Hagetaka(){
		this.setName("ハゲタカ");
		this.setHp(100);
		this.setExp(100);
	}

	public Hagetaka(String name){
		this.setName(name);
		this.setHp(100);
		this.setExp(100);
	}

	public Hagetaka(String name,int hp){
		this.setName(name);
		this.setHp(hp);
		this.setExp(100);
	}

}