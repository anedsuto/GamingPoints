package com.gaming.start.gamingpoints.juego;

import java.util.List;

import com.gaming.start.gamingpoints.excepciones.DatosGameExcepcion;

public interface JuegoCalcular {
	
	 List<Puntuacion> calcularPuntuacion(List<Integer> datosOrigenPuntuacion)throws DatosGameExcepcion;
}
