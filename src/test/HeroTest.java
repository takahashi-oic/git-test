package test;

import org.junit.Test;

import rpg.Hero;


public class HeroTest {

	@Test public void 引数なしコンストラクタで名前がななしさんになるか() {
		Hero h = new Hero();
		System.out.println(h.getName());
	}

}
