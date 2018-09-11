/**
 *
 * @author koyama
 *
 */
public class Wizard extends Character implements Human{
	public void run() {}

	Wizard() {}

	Wizard(int lv,int hp,String name) {
		super.setLv(lv);
		super.setHp(hp);
		super.setName(name);
	}

	public void attack( Monster m ) {
		if( this.getW() == null ){
			System.out.println("素手で殴って3ダメージ");
			m.setHp( m.getHp() - 3 );
		}else{
			this.getW().attack( m );
		}

		return;
	}

	Wizard(Wizard w){
		w.setHp(100);
		w.setLv(1);
		w.setName("ななしさん");
		w.setPower(10);
	}
}

