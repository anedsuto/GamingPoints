package com.gaming.start.lectura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.gaming.start.gamingpoints.excepciones.DatosGameExcepcion;
import com.gaming.start.gamingpoints.excepciones.DatosGameMessageExcepcion;
import com.gaming.start.gamingpoints.excepciones.DatosIOExcepcion;

public class Archivo extends Fuente {

	@Override
	public void leer() throws DatosIOExcepcion, DatosGameExcepcion {
		InputStream is = getClass().getClassLoader().getResourceAsStream(src);
		if(is==null)throw new DatosGameExcepcion(DatosGameMessageExcepcion.SIN_FUENTE_DE_LECTURA.getMensaje());
		procesarLectura(is);
	}

	private void procesarLectura(InputStream is) throws DatosIOExcepcion {
		try (InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(streamReader)) {
			
			Function<String, Integer> mappingFunction = linea -> {
				try {
					return Integer.parseInt(linea.substring(linea.indexOf(" ")).trim());
				} catch (Exception e) {
					return 0;
				}
			};
			Function<String, String> mappinglasificador = linea -> {
				{if(linea!=null && !"".equals(linea)) return linea.substring(0,linea.indexOf(" ")).trim();return "";}
			};
			Map<String, List<Integer>> clasificacion = reader.lines()
					.collect(Collectors.groupingBy(linea ->mappinglasificador.apply(linea),
							Collectors.mapping(linea -> mappingFunction.apply(linea),Collectors.toList())));

			datosLeidos = clasificacion;
		} catch (IOException e) {
			throw new DatosIOExcepcion(e);
		}
	}
}
