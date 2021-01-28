package com.gaming.start.gamingpoints.juego.bolos;

import java.util.ArrayList;
import java.util.List;

import com.gaming.start.gamingpoints.excepciones.DatosGameExcepcion;
import com.gaming.start.gamingpoints.juego.JuegoCalcular;
import com.gaming.start.gamingpoints.juego.Puntuacion;
import com.gaming.start.gamingpoints.juego.bolos.to.BolosPuntuacion;
import com.gaming.start.gamingpoints.turno.Turno;
import com.gaming.start.gamingpoints.turno.TurnoSimple;
import com.gaming.start.gamingpoints.turno.TurnoSpare;
import com.gaming.start.gamingpoints.turno.TurnoStrike;
import com.gaming.start.gamingpoints.util.DatosGameConstantes;

public class BolosCalculador implements JuegoCalcular {

	private List<Puntuacion> bolosPuntuacion;

	@Override
	public List<Puntuacion> calcularPuntuacion(List<Integer> datosOrigenPuntuacion) throws DatosGameExcepcion {
		Turno turno = null;
		bolosPuntuacion = new ArrayList<Puntuacion>();
		Puntuacion puntuacion;
		int totalTurno = 0;
		int frame = 1;

		for (int i = 0; i < datosOrigenPuntuacion.size(); i++) {
			puntuacion = new BolosPuntuacion();
			if (datosOrigenPuntuacion.get(i) == DatosGameConstantes.PUNTUACION_MAXIMA) {
				if (i <= datosOrigenPuntuacion.size() - DatosGameConstantes.LIMIT_BUFFER_STRIKE) {
					turno = new TurnoStrike(datosOrigenPuntuacion, i);
					((BolosPuntuacion) puntuacion).setLanzamientoUno(DatosGameConstantes.SIMBOLO_CHUZA);
					if (i == datosOrigenPuntuacion.size() - DatosGameConstantes.LIMIT_BUFFER_STRIKE) {
						((BolosPuntuacion) puntuacion).setBonusUno("" + datosOrigenPuntuacion.get(i + 1));
						((BolosPuntuacion) puntuacion).setBonusDos("" + datosOrigenPuntuacion.get(i + 2));
					}
				} else
					break;

			} else if (datosOrigenPuntuacion.get(i) < DatosGameConstantes.PUNTUACION_MAXIMA
					&& (datosOrigenPuntuacion.get(i)+ datosOrigenPuntuacion.get(i + 1) < DatosGameConstantes.PUNTUACION_MAXIMA)) {
				if (i <= datosOrigenPuntuacion.size() - DatosGameConstantes.LIMIT_BUFFER_SIMPLE) {
					turno = new TurnoSimple(datosOrigenPuntuacion, i);
					((BolosPuntuacion) puntuacion).setLanzamientoUno("" + datosOrigenPuntuacion.get(i));
					((BolosPuntuacion) puntuacion).setLanzamientoDos("" + datosOrigenPuntuacion.get(i + 1));
					i++;
				} else
					break;

			} else {
				if (i <= datosOrigenPuntuacion.size() - DatosGameConstantes.LIMIT_BUFFER_SPARE) {
					turno = new TurnoSpare(datosOrigenPuntuacion, i);
					((BolosPuntuacion) puntuacion).setLanzamientoUno("" + datosOrigenPuntuacion.get(i));
					((BolosPuntuacion) puntuacion).setLanzamientoDos(DatosGameConstantes.SIMBOLO_MEDIA);
					if (i == datosOrigenPuntuacion.size() - DatosGameConstantes.LIMIT_BUFFER_SPARE)
						((BolosPuntuacion) puntuacion).setBonusUno("" + datosOrigenPuntuacion.get(i + 1));
					i++;
				} else
					break;

			}
			if (frame <= DatosGameConstantes.RONDA_MAXIMA) {
				totalTurno += turno.calcularTotalTurno();				
				((BolosPuntuacion) puntuacion).setTotalEnLanzamientos(totalTurno);
				bolosPuntuacion.add(puntuacion);
				frame++;
			}

		}
		return bolosPuntuacion;
	}
}
