/**
 *
 * @author koyama
 *
 */
public class Wand extends Weapon {
	public void attack(Monster m) {
		m.setHp(m.getHp() - 2);
	}
}
