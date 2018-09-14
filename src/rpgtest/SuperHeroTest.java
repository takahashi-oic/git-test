package rpgtest;

import org.junit.Assert;
import org.junit.Test;

import rpg.SuperHero;
import rpg.Sword;
import rpg.Wand;
import rpg.Weapon;

public class SuperHeroTest {

	@Test
	public void キャラクター名前なし() {
		SuperHero sh = new SuperHero();

		Assert.assertEquals(sh.getName(),"ななしさん");

		System.out.println("\n");
	}

	@Test
	public void キャラクター名前あり() {
		SuperHero sh = new SuperHero();
		sh.setName("SuperHero");

		Assert.assertEquals(sh.getName(),sh.getName());

		System.out.println("\n");
	}

	/*@Test
	public void キャラクター名に数列を入れたとき() {
		SuperHero sh = new SuperHero();
		sh.setName(122121);

		Assert.assertEquals(sh.getName(),sh.getName());

		System.out.println("\n");
	}*/

	@Test
	public void lv指定なし() {
		SuperHero sh = new SuperHero();

		Assert.assertEquals(sh.getLv(),1);

		System.out.println("\n");
	}

	@Test
	public void lvに０を入れたとき() {
		SuperHero sh = new SuperHero();
		sh.setLv(0);

		Assert.assertEquals(sh.getLv(),1);

		System.out.println("\n");
	}

	@Test
	public void lvに負の数を入れたとき() {
		SuperHero sh = new SuperHero();
		sh.setLv(-1);

		Assert.assertEquals(sh.getLv(),1);

		System.out.println("\n");
	}

	@Test
	public void hp指定なし() {
		SuperHero sh = new SuperHero();

		Assert.assertEquals(sh.getHp(),100);

		System.out.println("\n");
	}

	@Test
	public void hpに０を入れたとき() {
		SuperHero sh = new SuperHero();
		sh.setHp(0);

		Assert.assertEquals(sh.getHp(),1);

		System.out.println("\n");
	}

	@Test
	public void hpに負の数を入れたとき() {
		SuperHero sh = new SuperHero();
		sh.setHp(-1);

		Assert.assertEquals(sh.getHp(),1);

		System.out.println("\n");
	}

	@Test
	public void popwer指定なし() {
		SuperHero sh = new SuperHero();

		Assert.assertEquals(sh.getPower(),10);

		System.out.println("\n");
	}

	@Test
	public void powerに０を入れたとき() {
		SuperHero sh = new SuperHero();
		sh.setPower(0);

		Assert.assertEquals(sh.getPower(),10);

		System.out.println("\n");
	}

	@Test
	public void powerに負の数を入れたとき() {
		SuperHero sh = new SuperHero();
		sh.setPower(-1);

		Assert.assertEquals(sh.getPower(),10);

		System.out.println("\n");
	}

	@Test
	public void 武器を装備しているとき() {
		SuperHero sh = new SuperHero();

		Weapon ws = new Sword();
		ws.setPower(10);
		ws.setName("木の剣");
		Weapon ww = new Wand();
		ww.setPower(5);
		ww.setName("木の棒");

		sh.setW(ws);

		Assert.assertEquals(sh.getPower(),sh.getW());

		System.out.println("\n");
	}

	@Test
	public void 武器を装備していないとき() {
		SuperHero sh = new SuperHero();

		Weapon ws = new Sword();
		ws.setPower(10);
		ws.setName("木の剣");
		Weapon ww = new Wand();
		ww.setPower(5);
		ww.setName("木の棒");


		Assert.assertEquals(sh.getPower(),sh.getW());

		System.out.println("\n");
	}
}
