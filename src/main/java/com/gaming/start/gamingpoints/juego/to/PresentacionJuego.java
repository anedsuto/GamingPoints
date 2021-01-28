package com.gaming.start.gamingpoints.juego.to;

import java.util.List;

import com.gaming.start.gamingpoints.juego.Puntuacion;

public class PresentacionJuego {
	private String nombreJugador;
	private List<Puntuacion> puntuacionJuego;

	public PresentacionJuego() {
		super();
	}

	public PresentacionJuego(String nombreJugador, List<Puntuacion> puntuacionJuego) {
		super();
		this.nombreJugador = nombreJugador;
		this.puntuacionJuego = puntuacionJuego;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public List<Puntuacion> getPuntuacionJuego() {
		return puntuacionJuego;
	}

	public void setPuntuacionJuego(List<Puntuacion> puntuacionJuego) {
		this.puntuacionJuego = puntuacionJuego;
	}

}
