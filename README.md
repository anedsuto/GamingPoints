_____GamingPoints_____
Version:0.0.1
Proyecto realizado inicialmente para llevar el cálculo del score de juego - Bolos. 
Construido:
JUnit 4.11
Java 1.8
Maven 3.6.3

Pre requisitos:
Configuración JDK1.8
--configuración de variable de entorno
Configuración mvn para ejecución correcta de comandos
--Maven existente
--configuración de variable de entorno

Pasos para ejecución:
1.Descargar proyecto y descomprimir
2.Cargar en consola la ubicación del proyecto 
>>cd ...\GamingPoints

3.Ejecutar comando para limpiar directorio target del proyecto y ejecutar la carga del artefacto generado en el directorio target, junto a su ubicación en el repositorio mvn.
>>mvn clean install

(Ubicación de archivos fuente)>>>\GamingPoints\src\main\resources
Fuentes existentes:
juego1.txt
juego2.txt
juego3.txt
juego4.txt

4.Continuar con comando que ejecuta la instrucción principal
>>\GamingPoints>java -cp target\GamingPoints-0.0.1-SNAPSHOT.jar com.gaming.start.gamingpoints.Ejecutor

****-----*****-----****----Ejemplo de ejecución:
--Amplia las dimensiones de consola para mejor visualización

Introduzca el nombre de la fuente de datos:juego2.txt <┘

                1               2               3               4               5               6               7               8               9               10
Marta
PinFalls        2     4     3      0        4      2        6      3        6      2        1      0               x        8      1        0      6        4      3
Score           6               9               15              24              32              33              52              61              67              74


                1               2               3               4               5               6               7               8               9               10
John
PinFalls        4     1     8      0        2      6               x               x               x        8      1        0      0        0      0        1      3
Score           5               13              21              51              79              98              107             107             107             111