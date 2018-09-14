package test;

import static org.junit.Assert.*;

import org.junit.Test;

import rpg.Hero;
import rpg.Zombie;


public class ZombieTest {

	@Test public void 引数なしコンストラクタで設定がされているか() {
		Zombie z = new Zombie();
		assertEquals("ゾンビ",z.getName());
		assertEquals(100,z.getHp());
		assertEquals(100,z.getExp());
	}

	@Test public void 名前ありコンストラクタで設定がされているか() {
		Zombie z = new Zombie("スミス");
		assertEquals("スミス",z.getName());
		assertEquals(100,z.getHp());
		assertEquals(100,z.getExp());
	}

	@Test public void 名前とHPありコンストラクタで設定がされているか(){
		Zombie z = new Zombie("スミス",120);
		assertEquals("スミス",z.getName());
		assertEquals(120,z.getHp());
		assertEquals(100,z.getExp());
	}

	@Test public void attackでダメージが与えられているか() {
		Zombie z = new Zombie();
		Hero h = new Hero();
		assertEquals(100,h.getHp());
		z.attack(h);
		assertEquals(95,h.getHp());
	}

	@Test public void hpがー100になったらdeadするか(){
		Zombie z = new Zombie();
		z.setHp(-100);
		assertEquals(-100,z.getHp());
		assertEquals(true,z.dead());
	}

	@Test public void hpがー101になってもdeadするか(){
		Zombie z = new Zombie();
		z.setHp(-101);
		assertEquals(-101,z.getHp());
		assertEquals(true,z.dead());
	}

	@Test public void hpがー99になってもdeadしないか(){
		Zombie z = new Zombie();
		z.setHp(-99);
		assertEquals(-99,z.getHp());
		assertEquals(false,z.dead());

	}

}
