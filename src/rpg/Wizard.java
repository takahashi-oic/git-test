package rpg;
/**
 *
 * @author koyama
 *
 */
public class Wizard extends Character implements Human{
	public void run() {}

	Wizard(int lv,int hp,String name) {
		super.setLv(lv);
		super.setHp(hp);
		super.setName(name);
	}

	public boolean attack( Monster m ) {
		return super.attack(m);
	}

	public boolean attack( Character c ) {
		return super.attack(c);
	}

	Wizard(){
		this.setHp(100);
		this.setLv(1);
		this.setName("ななしさん");
		this.setPower(10);
	}
}

