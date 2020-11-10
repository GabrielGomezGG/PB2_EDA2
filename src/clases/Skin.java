package clases;

public class Skin {
	protected Integer vida;
	protected Integer ataque;
	protected Boolean conVida;
	
	public Skin(){
		conVida = true;
	}
	
	//Si ambos estan vivos, el que recive el daño, 
	//se le resta en su vida el *ataque* de esta clase. 
	public Boolean atacar(Skin recive){
		
//		if(conVida && recive.conVida){
//			recive.vida -= ataque;
//			
//			if(recive.vida <= 0){
//				recive.conVida = false;
//			}
//			return true;
//		}
		return false;
	}
	
	public Boolean getConVida(){
		return this.conVida;
	}
	
	public Integer getVida(){
		return this.vida;
	}
}
