package rpg;
/**
 *
 * @author 小池 はるか
 *
 */

public class Hero extends Character implements Human {
	//runの実装
	public void run(){
		System.out.println("ひーろは逃げ出した!");
	}

	public boolean attack( Monster m ) {
		return super.attack(m);
	}

	public boolean attack( Character c ) {
		return super.attack(c);
	}

	public Hero(){
		this.setHp(100);
		this.setLv(1);
		this.setName("ななしさん");
		this.setPower(10);

		this.setMaxhp(getHp());
	}
}
