/**
 *
 * @author 小池 はるか
 *
 */

public class Hero extends Character implements Human {
	//runの実装
	public void run(){
		System.out.println("ひーろは逃げ出した!");
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

	public void attack( Character c ) {
		if( this.getW() == null ){
			System.out.println("素手で殴って"+ this.getPower() +"ダメージ");
			c.setHp( c.getHp() - this.getPower() );
		}else{
			this.getW().attack( c );
		}

		return;
	}

	Hero(){
		this.setHp(100);
		this.setLv(1);
		this.setName("ななしさん");
		this.setPower(10);
	}
}
