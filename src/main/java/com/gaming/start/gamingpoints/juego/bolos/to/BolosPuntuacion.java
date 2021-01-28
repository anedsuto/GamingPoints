package com.gaming.start.gamingpoints.juego.bolos.to;

import com.gaming.start.gamingpoints.juego.Puntuacion;

public class BolosPuntuacion extends Puntuacion {

	private String lanzamientoUno;
	private String lanzamientoDos;
	private String bonusUno;
	private String bonusDos;
	private int totaPuntuacionlEnLanzamientos;

	public String getLanzamientoUno() {
		return lanzamientoUno;
	}

	public void setLanzamientoUno(String lanzamientoUno) {
		this.lanzamientoUno = lanzamientoUno;
	}

	public String getLanzamientoDos() {
		return lanzamientoDos;
	}

	public void setLanzamientoDos(String lanzamientoDos) {
		this.lanzamientoDos = lanzamientoDos;
	}

	public String getBonusUno() {
		return bonusUno;
	}

	public void setBonusUno(String bonusUno) {
		this.bonusUno = bonusUno;
	}

	public String getBonusDos() {
		return bonusDos;
	}

	public void setBonusDos(String bonusDos) {
		this.bonusDos = bonusDos;
	}

	public int getTotalEnLanzamientos() {
		return totaPuntuacionlEnLanzamientos;
	}

	public void setTotalEnLanzamientos(int totalEnLanzamientos) {
		this.totaPuntuacionlEnLanzamientos = totalEnLanzamientos;
	}
	
	

}
