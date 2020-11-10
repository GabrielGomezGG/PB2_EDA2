package clases;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestJuego {
	
	@Test
	public void Probando(){
		Skin pj1 = new Personaje();
		Skin g1 = new Dragon();
		
		pj1.atacar(g1);
		pj1.atacar(g1);
		pj1.atacar(g1);
		
		assertTrue(g1.getConVida());
	}
}
