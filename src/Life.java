/**
 *
 * @author takahashi
 * 高橋
 *
 */
public abstract class Life {
	private int hp;
	public void dead(){
		if(this.hp <= 0){
			System.out.println("死亡");
		}
	}

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	};


}
