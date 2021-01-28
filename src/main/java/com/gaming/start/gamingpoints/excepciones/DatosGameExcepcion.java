package com.gaming.start.gamingpoints.excepciones;

public class DatosGameExcepcion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5589946102903914134L;

	
	public DatosGameExcepcion(Throwable throwable) {
		super(throwable);
	}
	
	public DatosGameExcepcion(String mensaje) {
		super(mensaje);		
	}

}
