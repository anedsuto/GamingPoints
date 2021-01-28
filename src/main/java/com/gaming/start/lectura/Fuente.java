package com.gaming.start.lectura;

import java.util.List;
import java.util.Map;

import com.gaming.start.gamingpoints.excepciones.DatosGameExcepcion;
import com.gaming.start.gamingpoints.excepciones.DatosIOExcepcion;

public abstract class Fuente {
	
	protected String src;
	protected Map <String,List<Integer>> datosLeidos;
	

	public abstract void leer()throws DatosIOExcepcion,DatosGameExcepcion;


	public String getSrc() {
		return src;
	}


	public void setSrc(String src) {
		this.src = src;
	}


	public Map<String, List<Integer>> getDatosLeidos() {
		return datosLeidos;
	}


	public void setDatosLeidos(Map<String, List<Integer>> datosLeidos) {
		this.datosLeidos = datosLeidos;
	}


	
	

	
	
	
	
}
