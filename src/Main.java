
public class Main {

	public static void main(String[] args) {
		Yatagarasu yataA = new Yatagarasu();
		Yatagarasu yataB = new Yatagarasu();

		Zombie zomA = new Zombie(10);

		Hero fujii = new Hero();
		Wizard ito = new Wizard();
		SuperHero fujiwara = new SuperHero();

		Weapon ws = new Sword();
		ws.setPower(10);
		Weapon ww = new Wand();
		ww.setPower(5);

		yataA.setHp(20);
		yataB.setHp(20);
		zomA.setHp(20);

		fujii.setHp(20);
		ito.setHp(20);
		fujiwara.setHp(100);

		for(;;){
			System.out.println("ゾンビAが八咫烏Bに攻撃");
			zomA.attack(yataB);
			//死んだらおわり
			if(yataB.getHp() <= 0){
				System.out.println("八咫烏B 死亡");
				break;
			}
		}
		System.out.println("\n");
		System.out.println("Hero藤井が八咫烏Ｂを攻撃");
		fujii.attack(yataB);
		System.out.println("Hero藤井が剣を装備");
		fujii.setW(ws);
		System.out.println("Hero藤井が八咫烏Ｂを攻撃");
		ws.attack(yataB);
		for(;;){
			System.out.println("ゾンビAがWizard伊藤に攻撃");
			zomA.attack(ito);
			//死んだらおわり
			if(ito.getHp() <= 0){
				System.out.println("Wizard伊藤 死亡");
				break;
			}
		}

		System.out.println("\n");

		for(;;){
			System.out.println("Wizard伊藤がゾンビAに攻撃");
			ito.attack(zomA);
			//死んだらおわり
			if(zomA.dead() == true){
				System.out.println("ゾンビA 死亡");
				ito.getExpcounter();
				System.out.println("の経験値を取得");
				if(ito.getExpcounter() > 100) {
					ito.
					System.out.println("Wizard伊藤は"+ito.getLv()+"にレベルアップ");
				}

				break;
			}
		}
		System.out.println("SuperHero藤原がHero藤井を攻撃");
		fujiwara.attack(fujii);

		System.out.println("Hero藤井 死亡");

	}
}
