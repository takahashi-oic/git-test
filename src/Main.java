
public class Main {

	public static void main(String[] args) {
		Yatagarasu yataA = new Yatagarasu();
		Yatagarasu yataB = new Yatagarasu();

		Zombie zomA = new Zombie(10);

		Hero fujii = new Hero();
		Wizard ito = new Wizard();

		Weapon ws = new Sword();
		ws.setPower(4);
		Weapon ww = new Wand();
		ww.setPower(3);

		yataA.setHp(20);
		yataB.setHp(20);
		zomA.setHp(20);

		fujii.setHp(20);
		ito.setHp(20);

		for(;;){
			System.out.println("ゾンビAが八咫烏Bに攻撃");
			zomA.attack(yataB);
			//死んだらおわり
			if(yataB.getHp() <= 0){
				System.out.println("八咫烏B 死亡");
				break;
			}
		}

		System.out.println("藤井が八咫烏Ｂを攻撃");
		fujii.attack(yataB);
		System.out.println("藤井が剣を装備");
		fujii.setW(ws);
		System.out.println("藤井が八咫烏Ｂを攻撃");
		ws.attack(yataB);
		for(;;){
			System.out.println("ゾンビAが伊藤に攻撃");
			zomA.attack(ito);
			//死んだらおわり
			if(ito.getHp() <= 0){
				System.out.println("伊藤 死亡");
				return;
			}
		}

	}
}
