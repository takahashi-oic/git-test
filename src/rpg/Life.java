package rpg;
/**
 *
 * @author takahashi
 * 高橋
 *
 */
public abstract class Life {
	private int hp;
	public boolean dead(){
		if(this.hp <= 0){
			System.out.println("死亡");
			return true;
		}else{
			return false;
		}
	}

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
			this.hp = hp;

	};
}
