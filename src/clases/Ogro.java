package clases;

public class Ogro extends Skin{
	
	private Integer garrotazo;

	public Ogro(){
		vida = 30;
		ataque = 10;
		garrotazo = 15;
	}
	
	@Override
	public Boolean atacar(Skin recive){
		if(conVida && recive.conVida){
			recive.vida -= ataque + garrotazo;
			
			if(recive.vida <= 0){
				recive.conVida = false;
			}
			return true;
		}
		return false;
	}
}
