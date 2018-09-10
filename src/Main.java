
public class Main {

	public static void main(String[] args) {
		Yatagarasu yataA = new Yatagarasu();
		Yatagarasu yataB = new Yatagarasu();

		Hero fujii = new Hero();
		Wizard ito = new Wizard();

		Weapon w = new Weapon();

		Zombie zomA = new Zombie(10);

		yataA.setHp(20);
		yataB.setHp(20);
		zomA.setHp(20);

		fujii.setHP(20);
		ito.setHP(20);

		for(;;){
			System.out.println("ゾンビAが八咫烏Bに攻撃");
			zomA.attack(yataB);
			//死んだらおわり
			if(yataB.getHp() <= 0){
				System.out.println("八咫烏B 死亡");
				return;
			}
		}

		System.out.println("藤井が八咫烏Ｂを攻撃");
		fujii.attack(yataB);
		System.out.println("藤井が剣を装備");
		fujii.setWeapon(w);
		System.out.println("藤井が八咫烏Ｂを攻撃");
		fujii.attack(yataB);
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
