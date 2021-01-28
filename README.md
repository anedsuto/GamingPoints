**GamingPoints** <br/>
**Version:0.0.1**<br/>
Proyecto realizado inicialmente para llevar el cálculo del score de juego - Bolos. <br/>
Construido:<br/>
JUnit 4.11<br/>
Java 1.8<br/>
Maven 3.6.3<br/>

Pre requisitos:<br/>
Configuración JDK1.8<br/>
-configuración de variable de entorno<br/>
Configuración mvn para ejecución correcta de comandos<br/>
-Maven existente<br/>
-configuración de variable de entorno<br/>

Pasos para ejecución: <br/>
1. Descargar proyecto y descomprimir<br/>
2. Cargar en consola la ubicación del proyecto <br/>
`cd ...\GamingPoints`<br/>

3. Ejecutar comando para limpiar directorio target del proyecto y ejecutar la carga del artefacto generado en el directorio target, junto a su ubicación en el repositorio mvn.<br/>
`mvn clean install`<br/>

(Ubicación de archivos fuente)>>>\GamingPoints\src\main\resources<br/>
Fuentes existentes:<br/>
juego1.txt<br/>
juego2.txt<br/>
juego3.txt<br/>
juego4.txt<br/>

4. Continuar con comando que ejecuta la instrucción principal<br/>
`java -cp target\GamingPoints-0.0.1-SNAPSHOT.jar com.gaming.start.gamingpoints.Ejecutor`<br/>


**-Ejemplo de ejecución:**<br/>
<sub><sup>Amplia las dimensiones de consola para mejor visualización</sup></sub> <br/>
Introduzca el nombre de la fuente de datos:juego2.txt <┘<br/>
