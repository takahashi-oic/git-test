/**
 *
 * @author fujinawa
 *
 */
public class Zombie extends Monster implements Human {

	public void attack() {}
	public void run() {}

	Zombie(int hp){
		super.setHp(hp);
	}

}
