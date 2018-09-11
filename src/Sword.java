/**
 *
 * @author koyama
 *
 */
public class Sword extends Weapon {
	public void attack(Monster m) {
		m.setHp(m.getHp() - this.getPower());
		System.out.println(this.getPower() + "のダメージ");
	}

	public void attack(Character c) {
		c.setHp(c.getHp() - this.getPower());
		System.out.println(this.getPower() + "のダメージ");
	}

}
