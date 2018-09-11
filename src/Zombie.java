/**
 *
 * @author fujinawa
 *
 */
public class Zombie extends Monster implements Human {

	public void attack(Monster m) {
		m.setHp(m.getHp() - 5);
		System.out.println("5のダメージ");
	}

	public void attack(Character c) {
		c.setHp(c.getHp() - 5);
		System.out.println("5のダメージ");
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

	Zombie(){
		this.setHp(100);
		this.setExp(100);
	}

	Zombie(int hp){
		super.setHp(hp);
		this.setExp(100);
	}

}
