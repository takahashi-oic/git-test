package rpg;

public abstract class Character extends Life {
	private int lv;
	private String name;
	private Weapon w;
	private int expcounter; //EXPの累計
	private int power; //素手の威力
	private int maxhp;

	//コンストラクタ
	Character(){
		//武器は持っていない
		this.w = null;
	};
	public boolean attack( Character c ) {
		System.out.println(this.getName() + "が" + c.getName() + "を攻撃");
		if( this.getW() == null ){
			System.out.println("素手で殴って"+ this.getPower() +"ダメージ");
			c.setHp( c.getHp() - this.getPower() );
		}else{
			this.getW().attack( c );
		}

		if(c.dead() == true) {
			return false;
		}
		return true;
	}

	public boolean attack(Monster m){
		System.out.println(this.getName() + "が" + m.getName() + "を攻撃");
		//素手
		if(this.w == null){
			System.out.println("素手で殴って" + power + "ダメージ");
			m.setHp(m.getHp() - power);
		} else {//武器あり
			w.attack(m);
		}

		if(m.dead() == true){
			this.setExpcounter(m.getExp() + this.getExpcounter());
			System.out.println(m.getExp() + "の経験値を取得");
			if(this.getExpcounter() >= 100) {
				this.lvup();
				System.out.println(this.getName() + "は"+this.getLv()+"にレベルアップ");
			}
			return false;
		}
		return true;
	}

	public void lvup(){
		this.setLv(this.getLv() + 1);
		this.setHp(this.getMaxhp());
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		if(lv <= 0) {
			this.lv = 1;
		} else 	{
			this.lv = lv;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		System.out.println(this.getName() + "が" + w.getName() + "を装備");
		this.w = w;
	}

	public int getExpcounter() {
		return expcounter;
	}

	public void setExpcounter(int expcounter) {
		this.expcounter = expcounter;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if(power <= 0) {
			this.power = 10;
		} else {
			this.power = power;
		}
	}

	public int getMaxhp() {
		return maxhp;
	}

	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}
}
