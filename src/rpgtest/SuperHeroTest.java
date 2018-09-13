package rpgtest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import rpg.Hero;
import rpg.SuperHero;

public class SuperHeroTest {

	@Test
	public void 二回攻撃できてるか() {
		SuperHero sh = new SuperHero();
		Hero h = new Hero();
		System.out.println("攻撃判定");
		Assert.assertNotNull(sh.attack(h));

		System.out.println("\n");
	}


	@Before
	public void 指定がないときのステータス取得() {
		SuperHero sh = new SuperHero();

		System.out.println("指定がないときのステータス");

		Assert.assertEquals(sh.getHp(),100);
		Assert.assertEquals(sh.getLv(),1);
		Assert.assertEquals(sh.getName(),"ななしさん");
		Assert.assertEquals(sh.getPower(),10);

		System.out.println("\n");
	}
}
