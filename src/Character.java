
public abstract class Character extends Life {
	private int lv;
	private String name;
	private Weapon w;

	//コンストラクタ
	Character(){
		//武器は持っていない
		this.w = null;
	};

	public void attack(Monster m){
		//素手
		if(this.w == null){
			System.out.println("素手で殴って2ダメージ");
			m.setHp(m.getHp() - 2);
		} else {//武器あり
			w.attack(m);
		}
		return;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
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
		this.w = w;
	};
}
