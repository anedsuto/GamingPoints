package com.gaming.start.gamingpoints.juego.to;

public class ResultadoJuego {
	
	private String mensaje;
	private boolean exitoso;

	
	
	
	public ResultadoJuego() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultadoJuego(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public ResultadoJuego(String mensaje, boolean exitoso) {
		super();
		this.mensaje = mensaje;
		this.exitoso = exitoso;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isExitoso() {
		return exitoso;
	}

	public void setExitoso(boolean exitoso) {
		this.exitoso = exitoso;
	}

}
