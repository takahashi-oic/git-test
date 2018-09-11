
public class SuperHero extends Hero {
	public void SuperHero() {}
	void attack() {}
	public void attack( Character c ) {
		if( this.getW() == null ){
			System.out.println("素手で殴って"+ this.getPower() +"ダメージ");
			c.setHp( c.getHp() - this.getPower() );
		}else{
			this.getW().attack( c );
		}

		if(c.dead()!= true){
			System.out.println("素手で殴って"+ this.getPower() +"ダメージ");
			c.setHp( c.getHp() - this.getPower() );
		}else{
			this.getW().attack( c );
		}

		return;
	}
}