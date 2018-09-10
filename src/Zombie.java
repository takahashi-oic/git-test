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

	public void run() {}

	Zombie(){}

	Zombie(int hp){
		super.setHp(hp);
	}

}
