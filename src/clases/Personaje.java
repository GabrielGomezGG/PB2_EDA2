package clases;

public class Personaje extends Skin {
	
	private Integer nivel;
	private Integer espada;
	
	public Personaje(){
		vida = 40;
		ataque = 10;
		espada = 5;
		nivel = 1;
	}
	
	public void subirNivel(){
		vida+=20;
		ataque+=5;
		nivel++;
	}
	
	@Override
	public Boolean atacar(Skin recive){
		if(conVida && recive.conVida){
			recive.vida -= ataque + espada;
			
			if(recive.vida <= 0){
				recive.conVida = false;
			}
			return true;
		}
		return false;
	}
	
}
