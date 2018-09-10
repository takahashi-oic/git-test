/**
 *
 * @author 小池 はるか
 *
 */

public class Hero extends Charactor implements Human {
	//runの実装
	public void run(){

	}

	public void attack( Monster m ) {
		if( this.w == null ){
			System.out.println("素手で殴って3ダメージ");
			m.setHp( m.getHp() - 3 );
		}else{
			w.attack( m );
		}

		return;
	}
}
