package clases;

public class Dragon extends Skin{
	
	private Integer fuego;

	public Dragon(){
		vida = 60;
		ataque = 15;
		fuego = 20;
	}
	
	@Override
	public Boolean atacar(Skin recive){
		if(conVida && recive.conVida){
			recive.vida -= ataque + fuego;
			
			if(recive.vida <= 0){
				recive.conVida = false;
			}
			return true;
		}
		return false;
	}
}
