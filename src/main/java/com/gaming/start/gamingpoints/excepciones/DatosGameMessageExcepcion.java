package com.gaming.start.gamingpoints.excepciones;

public enum DatosGameMessageExcepcion {

	CANTIDAD_TURNOS_INCORRECTO("Verificar la cantidad de turnos jugados"),
	SIN_FUENTE_DE_LECTURA("No es posible cargar la fuente de lectura");

	String mensaje;
	private DatosGameMessageExcepcion(String mensaje) {
		this.mensaje=mensaje;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
	
}
