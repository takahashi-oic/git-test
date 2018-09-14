package rpg;

public class SuperHero extends Hero {
	public void SuperHero(){

	}
	void attack() {}
	public boolean attack( Character c ) {
		//1回目の攻撃
		if(super.attack(c) == false){
			//死んでいる場合は2回目に行かずにreturn
			return false;
		}
		//2回目の攻撃 結果をreturn
		return super.attack(c);

	}
	public boolean attack( Monster m ) {
		//1回目の攻撃
		if(super.attack(m) == false){
			//死んでいる場合は2回目に行かずにreturn
			return false;
		}
		//2回目の攻撃 結果をreturn
		return super.attack(m);
	}
}