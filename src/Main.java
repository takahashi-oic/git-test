
public class Main {

	public static void main(String[] args) {
		Yatagarasu yataA = new Yatagarasu();
		Yatagarasu yataB = new Yatagarasu();

		Zombie zomA = new Zombie(10);

		yataA.setHp(20);
		yataB.setHp(20);
		zomA.setHp(20);

		for(;;){
			System.out.println("ゾンビAが八咫烏Bに攻撃");
			zomA.attack(yataB);
			//死んだらおわり
			if(yataB.getHp() <= 0){
				System.out.println("八咫烏B 死亡");
				return;
			}
		}
	}
}
