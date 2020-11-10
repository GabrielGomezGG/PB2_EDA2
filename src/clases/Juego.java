package clases;

import java.util.ArrayList;

public class Juego {
	ArrayList<Skin> personajes;
	ArrayList<Skin> enemigos;
	
	//TURNO
	//false -> enemigos
	//true -> personaje
	Boolean turno;
	
	public Juego(){
		turno = true;
	}
	
	public Boolean batalla(Skin[] personajes, Skin[] enemigos){
		return false;
	}
	
	public boolean agregarABatalla(Skin[] agro){
		return false;
	}
	
	public boolean eliminarCaido(Skin[] caido){
		return false;
	}
	
	public void cambiarTurno(){
		if(turno)
			turno = false;
		else
			turno = true;
	}
	
	
	
	
	
}


