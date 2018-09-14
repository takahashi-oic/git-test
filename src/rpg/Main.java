package rpg;

public class Main {

	public static void main(String[] args) {
		Yatagarasu yataA = new Yatagarasu();
		yataA.setName("八咫烏A");
		Yatagarasu yataB = new Yatagarasu();
		yataB.setName("八咫烏B");

		Zombie zomA = new Zombie();
		zomA.setName("ゾンビA");

		Hero fujii = new Hero();
		fujii.setPower(20);
		fujii.setHp(100);
		fujii.setName("Hero藤井");
		Wizard ito = new Wizard();
		ito.setPower(30);
		ito.setName("Wizard伊藤");
		SuperHero fujiwara = new SuperHero();
		fujiwara.setName("SuperHero藤原");


		Weapon ws = new Sword();
		ws.setPower(50);
		ws.setName("木の剣");
		Weapon ww = new Wand();
		ww.setPower(30);
		ww.setName("木の棒");

		yataA.setHp(20);
		yataB.setHp(20);
		zomA.setHp(20);

		fujii.setHp(20);
		ito.setHp(20);
		fujiwara.setHp(100);

		while(zomA.attack(yataB)){

		}
		System.out.println("\n");
		//Hero藤井が八咫烏Ｂを攻撃
		fujii.attack(yataB);
		//Hero藤井が剣を装備
		fujii.setW(ws);
		//Hero藤井が八咫烏Ｂを攻撃
		ws.attack(yataB);
		while(ito.attack(zomA)){

		}
		//SuperHero藤原がHero藤井を攻撃
		fujiwara.setW(ws);
		fujiwara.attack(fujii);
		//fujii.dead();
	}
}
