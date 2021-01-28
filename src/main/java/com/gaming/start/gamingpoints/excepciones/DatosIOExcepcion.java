package com.gaming.start.gamingpoints.excepciones;

public class DatosIOExcepcion extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2236935298568779697L;
	
	 

	public DatosIOExcepcion(Throwable throwable) {
		super(throwable);
	}
	
	public DatosIOExcepcion(String mensaje) {
		super(mensaje);		
	}

}
