package clases;

public class Goblin extends Skin {
	
	private Integer daga;
	
	public Goblin(){
		vida = 10;
		ataque = 5;
		daga = 5;
	}
	
	@Override
	public Boolean atacar(Skin recive){
		if(conVida && recive.conVida){
			recive.vida -= ataque + daga;
			
			if(recive.vida <= 0){
				recive.conVida = false;
			}
			return true;
		}
		return false;
	}
}
