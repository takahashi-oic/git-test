/**
 *
 * @author 小池 はるか
 *
 */

public class Hero extends Character implements Human {
	//runの実装
	public void run(){

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
}
