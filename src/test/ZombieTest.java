package test;

import org.junit.Test;

import rpg.Hero;
import rpg.Zombie;


public class ZombieTest {

	@Test public void 引数なしコンストラクタで設定がされているか() {
		System.out.println("引数なしコンストラクタで設定がされているか");
		Zombie z = new Zombie();
		System.out.println("zombieのname:" + z.getName());
		System.out.println("zombieのhp:" +z.getHp());
		System.out.println("zombieのexp:" +z.getExp());
		System.out.println("\n");
	}

	@Test public void 名前ありコンストラクタで設定がされているか() {
		System.out.println("名前ありコンストラクタで設定がされているか");
		Zombie z = new Zombie("スミス");
		System.out.println("zombieのname:" + z.getName());
		System.out.println("zombieのhp:" +z.getHp());
		System.out.println("zombieのexp:" +z.getExp());
		System.out.println("\n");
	}

	@Test public void 名前とHPありコンストラクタで設定がされているか() {
		System.out.println("名前とHPありコンストラクタで設定がされているか");
		Zombie z = new Zombie("スミス",120);
		System.out.println("zombieのname:" + z.getName());
		System.out.println("zombieのhp:" +z.getHp());
		System.out.println("zombieのexp:" +z.getExp());
		System.out.println("\n");
	}

	@Test public void attackでダメージが与えられているか() {
		System.out.println("attackでダメージが与えられているか");
		Zombie z = new Zombie();
		Hero h = new Hero();
		System.out.println("heroのhp:" + h.getHp());
		z.attack(h);
		System.out.println("heroのhp:" + h.getHp());
		System.out.println("\n");
	}

	@Test public void hpがー100になったらdeadするか(){
		System.out.println("hpがー100になったらdeadするか");
		Zombie z = new Zombie();
		z.setHp(-100);
		System.out.println("hp:" + z.getHp() + "の時");
		z.dead();
		System.out.println("\n");
	}

	@Test public void hpがー101になってもdeadするか(){
		System.out.println("hpがー101になってもdeadするか");
		Zombie z = new Zombie();
		z.setHp(-101);
		System.out.println("hp:" + z.getHp() + "の時");
		z.dead();
		System.out.println("\n");
	}

	@Test public void hpがー99になってもdeadするか(){
		System.out.println("hpがー99になってもdeadするか");
		Zombie z = new Zombie();
		z.setHp(-99);
		System.out.println("hp:" + z.getHp() + "の時");
		z.dead();
		System.out.println("\n");
	}

}
