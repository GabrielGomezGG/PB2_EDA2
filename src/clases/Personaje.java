//Esta clase representa al gerrero. 

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
		vida+=10;
		ataque+=5;
		nivel++;
	}
	
	//El personaje sube de lv cada vez que mata un enemigo
	@Override
	public Boolean atacar(Skin recive){
		if(conVida && recive.conVida){
			recive.vida -= ataque + espada;
			
			if(recive.vida <= 0){
				recive.conVida = false;
				subirNivel();
			}
			return true;
		}
		return false;
	}
	
	public Integer getNivel(){
		return nivel;
	}
	
}
