
public abstract class Character {
	private int lv;
	private String name;
	private Weapon w;

	public void attack(){}

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
