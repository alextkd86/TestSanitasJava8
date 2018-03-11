# pruebaSanitas
Prueba con Spring

1.- Introduzco la JDK 8 (En eclipse, en nuestro workspace --> Window --> Preferences --> Java --> Installed JREs
2.- Me importo la librería sportalclientesweb-1.19.0.jar
	Para ello, abro un terminal, me coloco en la carpeta principal del proyecto (A la altura de nuestro pom.xml) y ejecuto el 	siguiente comando --> mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  -Dfile=C:\Users\Alex\Desktop\test2-20180310T114114Z-001\test2\sportalclientesweb-1.19.0.jar -DgroupId=sanitas.bravo.clientes -DartifactId=sportalclientesweb -Dversion=1.0 -Dpackaging=jar -DlocalRepositoryPath=C:\Users\Alex\.m2\repository
	Así consigo quitarme todos los errores que me indicaba el eclipse.
3.- He cambiado el pom para usar springboot.
4.- He cambiado los catch, que eran muy generales con Exception, por excepciones más específicos.
5.- He introducido un Rest para hacer la llamada al alta (Pero va a petar, ya que no cargan ciertas clases de la librería y no tengo las URL y los Beans que se inyectan de las properties, por los que le he puesto un valor por defecto).
6.- Para generar el JAR a usar, basta con run --> mvn clean package
	A partir de ahí, coger el jar generado en el target y echarlo a andar desde la terminal con el siguiente comando --> java -jar rutaDelJar/nombreDelJar.jar.
	
	El rest se llama --> localhost:8080/prueba