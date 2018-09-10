/**
 *
 * @author fujinawa
 *
 */
public class Zombie extends Monster implements Human {

	public void attack(Monster m) {
		m.setHp(m.getHp() - 5);
	}
	public void run() {}

	Zombie(int hp){
		super.setHp(hp);
	}

}
