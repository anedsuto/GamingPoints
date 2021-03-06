package com.gaming.start.gamingpoints.turno;

import java.util.List;

import com.gaming.start.gamingpoints.excepciones.DatosGameExcepcion;
import com.gaming.start.gamingpoints.excepciones.DatosGameMessageExcepcion;
import com.gaming.start.gamingpoints.util.DatosGameConstantes;

public class TurnoStrike implements Turno {

	private List<Integer> puntuacion;
	private int indice;

	public TurnoStrike() {
		super();
	}

	public TurnoStrike(List<Integer> puntuacion, int indice) {
		this.puntuacion = puntuacion;
		this.indice = indice;
	}

	@Override
	public int calcularTotalTurno() throws DatosGameExcepcion {
		
			try {
				List<Integer> lista = puntuacion.subList(this.indice, indice + DatosGameConstantes.LIMIT_BUFFER_STRIKE);
				return lista.stream().mapToInt(Integer::intValue).sum();
			} catch (IndexOutOfBoundsException e) {
				throw new DatosGameExcepcion(DatosGameMessageExcepcion.CANTIDAD_TURNOS_INCORRECTO.getMensaje());
			}	
		
	}
}
