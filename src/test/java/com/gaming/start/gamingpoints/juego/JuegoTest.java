package com.gaming.start.gamingpoints.juego;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gaming.start.gamingpoints.excepciones.DatosGameExcepcion;
import com.gaming.start.gamingpoints.juego.bolos.BolosCalculador;
import com.gaming.start.gamingpoints.juego.bolos.to.BolosPuntuacion;

public class JuegoTest {
	
	JuegoCalcular juegoCalcular;
	List<Puntuacion> resultado;
	BolosPuntuacion	item ;
	
	@Before
    public void inicializa(){      
		 juegoCalcular= new BolosCalculador();
		 resultado = new ArrayList<Puntuacion>();
		 item= new BolosPuntuacion();
    }
	
		
	@Test
    public void comprobarInvicto(){
		
		ArrayList<Integer> jugadas=new ArrayList<>();
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
	
		try {
			resultado = juegoCalcular.calcularPuntuacion(jugadas);
			item=(BolosPuntuacion) resultado.get(resultado.size()-1);
		} catch (DatosGameExcepcion e) {		
			e.printStackTrace();
		}
	
        assertEquals(300,item.getTotalEnLanzamientos());
    }
	
	
	@Test
    public void comprobarJuego1(){
		
		ArrayList<Integer> jugadas=new ArrayList<>();
		jugadas.add(10);
		jugadas.add(7);
		jugadas.add(3);
		jugadas.add(9);
		jugadas.add(0);
		jugadas.add(10);
		jugadas.add(0);
		jugadas.add(8);
		jugadas.add(8);
		jugadas.add(2);
		jugadas.add(0);
		jugadas.add(6);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(8);
		jugadas.add(1);
		try {
			resultado = juegoCalcular.calcularPuntuacion(jugadas);
			item=(BolosPuntuacion) resultado.get(resultado.size()-1);
		} catch (DatosGameExcepcion e) {		
			e.printStackTrace();
		}
	
        assertEquals(167,item.getTotalEnLanzamientos());
    }
	
	@Test
    public void comprobarJuego2(){
		
		ArrayList<Integer> jugadas=new ArrayList<>();
		jugadas.add(3);
		jugadas.add(7);
		jugadas.add(6);
		jugadas.add(3);
		jugadas.add(10);	
		jugadas.add(8);
		jugadas.add(1);
		jugadas.add(10);
		jugadas.add(10);
		jugadas.add(9);
		jugadas.add(0);
		jugadas.add(7);
		jugadas.add(3);
		jugadas.add(4);
		jugadas.add(4);
		jugadas.add(10);
		jugadas.add(9);
		jugadas.add(0);
		try {
			resultado = juegoCalcular.calcularPuntuacion(jugadas);
			item=(BolosPuntuacion) resultado.get(resultado.size()-1);
		} catch (DatosGameExcepcion e) {		
			e.printStackTrace();
		}
	
        assertEquals(151,item.getTotalEnLanzamientos());
    }
}
