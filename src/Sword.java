/**
 *
 * @author koyama
 *
 */
public class Sword extends Weapon {
	public void attack(Monster m) {
		m.setHp(m.getHp() - 4);
	}

}
