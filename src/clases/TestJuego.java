package clases;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestJuego {
	
	@Test
	public void ProbandoAtacar(){
		
		//Probando Atacar()
		Skin pj1 = new Personaje();
		Skin g1 = new Dragon();
		
		pj1.atacar(g1);
		pj1.atacar(g1);
		pj1.atacar(g1);
		
		assertTrue(g1.getConVida());
	}
	
	@Test
	public void AgregandoPersonajes(){
		//Agregar personaje
		
		Juego juego = new Juego();
		
		assertFalse(juego.agregarPersonajes(0));
		assertTrue(juego.agregarPersonajes(5));
	}
		
	@Test
	public void EliminandoCaidos(){
		
		Dragon dragon = new Dragon();
		Juego juego = new Juego();
		
		juego.agregarPersonajes(4);
		
		//El dragon de dos ataques elimina al personaje
		
		dragon.atacar(juego.getPersonajes().get(0));
		dragon.atacar(juego.getPersonajes().get(0));
		
		juego.eliminarCaido(juego.getPersonajes());
		//Elimino a 1
		assertEquals(3, juego.getPersonajes().size());
		
		dragon.atacar(juego.getPersonajes().get(0));
		dragon.atacar(juego.getPersonajes().get(0));
		
		juego.eliminarCaido(juego.getPersonajes());
		//Elimino a otro
		assertEquals(2, juego.getPersonajes().size());		
	}
	
	@Test
	public void BatallaFinal(){
		
		Juego juego = new Juego();
		
		juego.agregarPersonajes(1);
		juego.agregarEnemigos(1, 3);
		juego.agregarEnemigos(2, 1);
		juego.agregarEnemigos(3, 3);
		
		//Un personaje VS 3 goblins, 1 ogro, 1 dragon
		
		assertFalse(juego.batallaFinal());	
		//perdio el Personaje
		
		juego.vaciarListas();
	}
}
