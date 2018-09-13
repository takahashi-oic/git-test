package test;

import org.junit.Test;

import rpg.Hagetaka;
import rpg.Hero;
import rpg.Zombie;

public class HagetakaTest {

	@Test
	public void test() {}

	@Test public void 引数なしコンストラクタで設定がされているか() {
		System.out.println("引数なしコンストラクタで設定がされているか");
		Hagetaka t = new Hagetaka();
		System.out.println("zombieのname:" + t.getName());
		System.out.println("zombieのhp:" + t.getHp());
		System.out.println("zombieのexp:" + t.getExp());
		System.out.println("\n");
	}

	@Test public void 名前ありコンストラクタで設定がされているか() {
		System.out.println("名前ありコンストラクタで設定がされているか");
		Hagetaka t = new Hagetaka("ゴブルス");
		System.out.println("zombieのname:" + t.getName());
		System.out.println("zombieのhp:" + t.getHp());
		System.out.println("zombieのexp:" + t.getExp());
		System.out.println("\n");
	}

	@Test public void 名前とHPありコンストラクタで設定がされているか() {
		System.out.println("名前とHPありコンストラクタで設定がされているか");
		Hagetaka t = new Hagetaka("ゴブルス",80);
		System.out.println("zombieのname:" + t.getName());
		System.out.println("zombieのhp:" + t.getHp());
		System.out.println("zombieのexp:" + t.getExp());
		System.out.println("\n");
	}

	@Test public void Characterにattackでダメージが与えられているか() {
		System.out.println("Characterにattackでダメージが与えられているか");
		Hagetaka t = new Hagetaka();
		Hero h = new Hero();
		System.out.println("heroのhp:" + h.getHp());
		t.attack(h);
		System.out.println("heroのhp:" + h.getHp());
		System.out.println("\n");
	}

	@Test public void Monsterにattackでダメージが与えられているか() {
		System.out.println("Monsterにattackでダメージが与えられているか");
		Hagetaka t = new Hagetaka();
		Zombie z = new Zombie();
		System.out.println("zombieのhp:" + z.getHp());
		t.attack(z);
		System.out.println("zombieのhp:" + z.getHp());
		System.out.println("\n");
	}

}
