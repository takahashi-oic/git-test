/**
 *
 * @author koyama
 *
 */
public class Wizard extends Character implements Human{
	public void run() {}

	Wizard(int lv,int hp,String name) {
		super.setLv(lv);
		super.setHp(hp);
		super.setName(name);
	}

	public void attack( Monster m ) {
		if( this.getW() == null ){
			System.out.println("素手で殴って"+ this.getPower() +"ダメージ");
			m.setHp( m.getHp() - this.getPower() );
		}else{
			this.getW().attack( m );
		}

		return;
	}

	Wizard(){
		this.setHp(100);
		this.setLv(1);
		this.setName("ななしさん");
		this.setPower(10);
	}
}

