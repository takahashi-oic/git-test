/**
 *
 * @author koyama
 *
 */
public class Wizard extends Character implements Human{
	public void run() {}

	Wizard() {}

	Wizard(int lv,int hp,String name) {
		super.setLv(lv);
		super.setHp(hp);
		super.setName(name);
	}

}
