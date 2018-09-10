/**
 * 八咫烏
 * @author ishisaka
 * 石坂 春輝
 * @since 10.0.1
 */
public class Yatagarasu
	extends Monster
	implements Bird {

	private int atk;

	public Yatagarasu(final int hp, final int atk) {
		// TODO super(hp);
	}
	public Yatagarasu(){}

	public void attack(Monster m){
		m.setHp(m.getHp() - 5);
	}

	/**
	 * atk getterMethod
	 * @return atk
	 */
	public int getAtk() {
		return this.atk;
	}

	/**
	 * atk setterMethod
	 * @param atk
	 * 	atk抽象
	 */
	public void setAtk(final int atk) {
		this.atk = atk;
	}

	@Override
	public void run() {
		System.out.printf("%sは飛んで逃げだした！", this);
	}

	// TODO @Override
	void attack(final Life life) {
		System.out.printf("%sに%dのダメージ", this, this.atk); life.setHp(life.getHp() - this.atk);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

	@Override
	public void dead() {
		if(this.getHp() <= 0) System.out.printf("%sが死亡", this);
	}

	@Override
	public int getHp() {
		return super.getHp();
	}

	@Override
	public void setHp(final int hp) {
		super.setHp(hp);
	}
}
