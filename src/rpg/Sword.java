package rpg;
/**
 *
 * @author koyama
 *
 */
public class Sword extends Weapon {
	public void attack(Monster m) {
		m.setHp(m.getHp() - this.getPower());
		System.out.println(m.getName() + "に" + this.getPower() + "のダメージ");

	}

	public void attack(Character c) {
		c.setHp(c.getHp() - this.getPower());
		System.out.println(c.getName() + "に" + this.getPower() + "のダメージ");

	}

}
