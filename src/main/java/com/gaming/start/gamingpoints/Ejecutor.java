package com.gaming.start.gamingpoints;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.gaming.start.gamingpoints.excepciones.DatosGameExcepcion;
import com.gaming.start.gamingpoints.excepciones.DatosGameMessageExcepcion;
import com.gaming.start.gamingpoints.excepciones.DatosIOExcepcion;
import com.gaming.start.gamingpoints.juego.JuegoCalcular;
import com.gaming.start.gamingpoints.juego.JuegoPresentar;
import com.gaming.start.gamingpoints.juego.Puntuacion;
import com.gaming.start.gamingpoints.juego.bolos.BolosCalculador;
import com.gaming.start.gamingpoints.juego.bolos.BolosPresentador;
import com.gaming.start.gamingpoints.juego.to.PresentacionJuego;
import com.gaming.start.gamingpoints.util.DatosGameConstantes;
import com.gaming.start.lectura.Archivo;
import com.gaming.start.lectura.Fuente;


public class Ejecutor {
	
	public static void main(String[] args) {
		String nombreArchivoLectura;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el nombre de la fuente de datos: ");
		nombreArchivoLectura = sc.nextLine();
		if(nombreArchivoLectura==null || nombreArchivoLectura.isEmpty()) {
			System.out.println(DatosGameMessageExcepcion.SIN_FUENTE_DE_LECTURA.getMensaje());
		}else {
			Ejecutor ejecutor= new Ejecutor();
			ejecutor.ejecutarOperacion(nombreArchivoLectura.trim());			
		}
	}
	
	void ejecutarOperacion(String fuente){
		Map<String, List<Integer>> datosLeidos;
		try {
			datosLeidos = leerFuente(fuente);
		} catch (DatosIOExcepcion | DatosGameExcepcion e1) {
			System.err.println(e1.getMessage());
			return;
		}		

		JuegoCalcular juegoCalcular = new BolosCalculador();
		JuegoPresentar juegoPresentar = new BolosPresentador();
		
		for (Entry<String, List<Integer>> entrada : datosLeidos.entrySet()) {
				if(entrada.getKey().isEmpty()) {
					continue;
				}
			try {
				List<Puntuacion> bolosPuntuacion = juegoCalcular.calcularPuntuacion(entrada.getValue());
				PresentacionJuego presentacionJuego = new PresentacionJuego(entrada.getKey(), bolosPuntuacion);
				StringBuilder impresion = juegoPresentar.imprimirPuntuacion(presentacionJuego);
				System.out.println(DatosGameConstantes.SIMBOLO_SALTO+impresion);
			} catch (DatosGameExcepcion e) {
				System.err.println(e.getMessage());
				return;
			}
	    }
		
	
	}
	 static Map<String, List<Integer>> leerFuente(String src) throws DatosIOExcepcion, DatosGameExcepcion {
		Fuente fuente = new Archivo();
		fuente.setSrc(src);	
	    fuente.leer();		
		return fuente.getDatosLeidos();
	}
	
	

}
