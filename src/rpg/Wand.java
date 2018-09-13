package rpg;
/**
 *
 * @author koyama
 *
 */
public class Wand extends Weapon {
	public boolean attack(Monster m) {
		m.setHp(m.getHp() - this.getPower());
		System.out.println(this.getPower() + "のダメージ");

		if(m.dead() == true) {
			return false;
		}
		return true;
	}

	public boolean attack(Character c) {
		c.setHp(c.getHp() - this.getPower());
		System.out.println(this.getPower() + "のダメージ");

		if(c.dead() == true) {
			return false;
		}
		return true;
	}
}
