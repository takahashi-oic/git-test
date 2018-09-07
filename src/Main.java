
public class Main {

	public static void main(String[] args) {
		//
		Yatagarasu yataA = new Yatagarasu();
		Yatagarasu yataB = new Yatagarasu();

		Zombie zomA = new Zombie();

		for(;;){
			zomA.attack(yataB);
			//死んだらおわり
			if(yataB.getHp <= 0){
				return;
			}
		};
	}
}
