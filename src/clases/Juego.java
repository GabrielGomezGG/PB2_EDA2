package clases;

import java.util.ArrayList;

public class Juego {
	private ArrayList<Skin> personajes;
	private ArrayList<Skin> enemigos;
	
	//TURNO
	//false -> enemigos
	//true -> personaje
	Boolean turno;
	
	public Juego(){
		turno = true;
		personajes = new ArrayList<Skin>();
		enemigos = new ArrayList<Skin>();
	}
	
	/*
	-Si las listas de personajes y enemigos no estan vacias
	¡comienza la batalla!
	-La batalla dura hasta que uno de los dos se quede sin "tropas" (.isEmpty() == true)
	-En cada turno, al que le corresponda, ataca a su oponente, si este muere, 
	se lo borra de la lista.
	-Los que pelean en la lista, siempre seran los de la posicion [0].
	-ganador:
	true = personajes
	false = false
	*/
	public Boolean batallaFinal(){
		//if(!personajes.isEmpty() && !enemigos.isEmpty()){
			//TURNO
			//false -> enemigos
			//true -> personaje
		
		Boolean siBatallaron = false;
			
			while(!personajes.isEmpty() && !enemigos.isEmpty()){
				
				siBatallaron = true;
				
				//Turno personajes
				if(turno){
					personajes.get(0).atacar(enemigos.get(0));
					eliminarCaido(enemigos);
				}
				
				//turno enemigos
				if(!turno){
					enemigos.get(0).atacar(personajes.get(0));
					eliminarCaido(personajes);
					
					
				}
				cambiarTurno();
			}
			
			if(siBatallaron){
				if(personajes.isEmpty())
					return false;
				
				if(enemigos.isEmpty())
					return true;
			}
			
			return false;
		//}
		
	}
	
	//Agrega Personaje a la lista personajes igual a la cantidad ingresada
	public boolean agregarPersonajes(Integer cantidad){
			
		if(cantidad > 0){
			for(int i = 0; i < cantidad; i++){
				personajes.add(new Personaje());
			}
			return true;
		}
		return false;
	}
	
	//Agregar enemigos a la lista, pero se puede agregar de distintos tipo:
	//1: Goblins
	//2: Ogro
	//3: Dragon
	//por defecto: goblins
	public Boolean agregarEnemigos(Integer tipo, Integer cantidad){
		
		if(cantidad > 0){
			switch (tipo) {
				case 1: 
					for(int i = 0; i < cantidad; i++){
						enemigos.add(new Goblin());
					}
					break;
				case 2: 
					for(int i = 0; i < cantidad; i++){
					enemigos.add(new Ogro());
				}
				break;
				case 3: 
					for(int i = 0; i < cantidad; i++){
						enemigos.add(new Dragon());
					}
					break;
				default:
					for(int i = 0; i < cantidad; i++){
						enemigos.add(new Goblin());
					}
					break;
			}
			return true;
	    }
		
		return false;
	}
	
	//Elimina el primer elemento del array si es que 
	//esta muerto (conVida = false).
	public boolean eliminarCaido(ArrayList<Skin> caido){
		
		if(!caido.get(0).getConVida()){
			caido.remove(0);
			return true;
		}
		return false;
	}
	
	public void cambiarTurno(){
		if(turno)
			turno = false;
		else
			turno = true;
	}
	
	public ArrayList<Skin> getPersonajes(){
		return personajes;
	}
	
	public ArrayList<Skin> getEnemigos(){
		return enemigos;
	}
	
	public void vaciarListas(){
		personajes.clear();
		enemigos.clear();
	}
	
	
	
	
	
}


