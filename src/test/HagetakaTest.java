package test;

import static org.junit.Assert.*;

import org.junit.Test;

import rpg.Hagetaka;
import rpg.Hero;
import rpg.Zombie;

public class HagetakaTest {

	@Test
	public void test() {}

	@Test public void 引数なしコンストラクタで設定がされているか() {
		Hagetaka t = new Hagetaka();
		assertEquals("ハゲタカ",t.getName());
		assertEquals(100,t.getHp());
		assertEquals(100,t.getExp());
	}

	@Test public void 名前ありコンストラクタで設定がされているか() {
		Hagetaka t = new Hagetaka("ゴブルス");
		assertEquals("ゴブルス",t.getName());
		assertEquals(100,t.getHp());
		assertEquals(100,t.getExp());
	}

	@Test public void 名前とHPありコンストラクタで設定がされているか() {
		Hagetaka t = new Hagetaka("ゴブルス",80);
		assertEquals("ゴブルス",t.getName());
		assertEquals(80,t.getHp());
		assertEquals(100,t.getExp());
	}

	@Test public void Characterにattackでダメージが与えられているか() {
		Hagetaka t = new Hagetaka();
		Hero h = new Hero();
		assertEquals(100,h.getHp());
		t.attack(h);
		assertEquals(95,h.getHp());
	}

	@Test public void Monsterにattackでダメージが与えられているか() {
		Hagetaka t = new Hagetaka();
		Zombie z = new Zombie();
		assertEquals(100,z.getHp());
		t.attack(z);
		assertEquals(95,z.getHp());
	}

}
