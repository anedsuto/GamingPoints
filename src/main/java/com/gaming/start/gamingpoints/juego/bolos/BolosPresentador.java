package com.gaming.start.gamingpoints.juego.bolos;

import java.util.function.Consumer;

import com.gaming.start.gamingpoints.juego.JuegoPresentar;
import com.gaming.start.gamingpoints.juego.Puntuacion;
import com.gaming.start.gamingpoints.juego.bolos.to.BolosPuntuacion;
import com.gaming.start.gamingpoints.juego.to.PresentacionJuego;
import com.gaming.start.gamingpoints.util.DatosGameConstantes;

public class BolosPresentador implements JuegoPresentar {

	@Override
	public StringBuilder imprimirPuntuacion(PresentacionJuego presentacionJuego) {

		StringBuilder builder = new StringBuilder();
		builder.append(DatosGameConstantes.SIMBOLO_TABULADOR+DatosGameConstantes.SIMBOLO_TABULADOR);
		for (int i = 1; i <= presentacionJuego.getPuntuacionJuego().size(); i++) {
			builder.append(i).append(DatosGameConstantes.SIMBOLO_TABULADOR + DatosGameConstantes.SIMBOLO_TABULADOR);
		}
		Consumer<Puntuacion> consumerLanzamientos = item -> {
			obtenerCadenasLanzamientos((BolosPuntuacion) item, builder);
		};
		Consumer<Puntuacion> consumerPuntajes = item -> {
			obtenerCadenasPuntaje((BolosPuntuacion) item, builder);
		};
		builder.append(DatosGameConstantes.SIMBOLO_SALTO);
		builder.append(presentacionJuego.getNombreJugador()).append(DatosGameConstantes.SIMBOLO_SALTO);
		builder.append(DatosGameConstantes.PINFALLS).append(DatosGameConstantes.SIMBOLO_TABULADOR);
		presentacionJuego.getPuntuacionJuego().forEach(consumerLanzamientos);		
		builder.append(DatosGameConstantes.SIMBOLO_SALTO);
		builder.append(DatosGameConstantes.SCORE).append(DatosGameConstantes.SIMBOLO_TABULADOR+DatosGameConstantes.SIMBOLO_TABULADOR);
		presentacionJuego.getPuntuacionJuego().forEach(consumerPuntajes);
		return builder;
		
	}

	void obtenerCadenasLanzamientos(BolosPuntuacion bolosPuntuacion, StringBuilder builder) {
		String bonus1=bolosPuntuacion.getBonusUno()!=null?bolosPuntuacion.getBonusUno():"";
		String bonus2=bolosPuntuacion.getBonusDos()!=null?bolosPuntuacion.getBonusDos():"";
		if (bolosPuntuacion.getLanzamientoUno().equals(DatosGameConstantes.SIMBOLO_CHUZA)) {
			builder.append(DatosGameConstantes.SIMBOLO_TABULADOR).append(bolosPuntuacion.getLanzamientoUno()).append(DatosGameConstantes.SIMBOLO_TABULADOR).append(bonus1).append(" ").append(bonus2);
		} else {
			builder.append(bolosPuntuacion.getLanzamientoUno()).append(DatosGameConstantes.SIMBOLO_TABULADOR).append(bolosPuntuacion.getLanzamientoDos()).append(DatosGameConstantes.SIMBOLO_TABULADOR).append(bonus1).append(" ").append(bonus2);
		}
	}

	void obtenerCadenasPuntaje(BolosPuntuacion bolosPuntuacion, StringBuilder builder) {
		if (bolosPuntuacion.getLanzamientoUno().equals(DatosGameConstantes.SIMBOLO_CHUZA)) {
			builder.append(bolosPuntuacion.getTotalEnLanzamientos()).append(DatosGameConstantes.SIMBOLO_TABULADOR + DatosGameConstantes.SIMBOLO_TABULADOR);
		} else {
			builder.append(bolosPuntuacion.getTotalEnLanzamientos()).append(DatosGameConstantes.SIMBOLO_TABULADOR + DatosGameConstantes.SIMBOLO_TABULADOR);
		}
	}

}
