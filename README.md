# Cave-spring-boot

## Sobre el entorno
Como en el ejercicio no se especificaba ningún entorno de trabajo en concreto, ni ninguna versión con la que trabajar; a continuación detallo las versiones del entorno de trabajo que yo he utilizado:
- Java 17
- Spring Boot 3.4.2
- Apache-Maven 3.3.8
- OpenApi 3.0.3
- VisualStudioCode 1.97.2 (Como entorno de trabajo, de compilación y de despliegue)

El resto de dependencias se pueden ver en el pom.xml.

## Conexión a BBDD
Por petición del ejercico la conexión a BBDD es de postgres, y la ruta a la conexión se encuentra dentro del fichero .properties.

   ```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/exercicedb
spring.datasource.username=postgres
spring.datasource.password=contraseña
   ```

## Compilar y desplegar
En Java 17+ hay ciertos problemas a la hora de acceder a las clases del jdk por tema de privacidad. En el compiler del pom.xml he añadido los argumentos para que a la hora de compilar el proyecto los pille, y desbloquee las clases necesárias. No he tenido tiempo de probarlo en otros IDE (Eclipse o STS (El eclipse disfrazado de springboot), así que tampoco puedo garantizar su despliegue ahí.

Seguramente, en los IDE de Eclipse se tenga que añadir el boot dashboard los siguientes argumentos (que son los que contiene el pom.xml):
- --add-opens=java.base/java.lang.reflect=ALL-UNNAMED
- --add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED

También es posible que el propio compilador de maven del eclipse necesite el siguiente argumento si no lo pilla del pom.xml:
- --add-opens jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED
- --add-exports jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED

Estos argumentos también se pueden llevar al nivel de variable de entorno, dentro de las variables **JAVA_TOOL_OPTIONS** y **MAVEN_OPTS**.

Después de todo esto, para lanzar el compilado es tan sencillo como usar:
   ```bash
   mvn clean install -U
   ```
La compilación no da errores a fecha 20/02/2025 en la rama main, así que no debería dar problemas a la hora de compilar el proyecto.

Para el despliegue, yo he utilizado el tomcat embebido dentro de springboot, pero la paquetización esta en war y se podría utilizar otro servidor como jboss (que no puedo validar que funcione correctamente, porque solo he probado en Tomcat). Una vez desplegado se puede acceder a la URL http://localhost:8080/swagger-ui/index.html donde se encuentra la API de tarifas.

Desde la misma pantalla se pueden lanzar las llamadas a lo servicios para probarlos.

## Que se ha entregado
- Toda la documentación del API Rest está hecha en OpenAPI y se puede encontrar en el fichero **tarifas-service.yml**.
- Se ha creado la BBDD de Postgres, inicializada con los datos del documento y se ha establecido conexión con ella.
- El servicio de alta está implementado y funciona correctamente; creando tarifas nuevas con el secuencial creado para la tabla.
- El servicio de modificación está implementando y funciona correctamente; editando la tarifa que se pasa como parámetro de entrada en el requestBody.
- El servicio de borrado está implementado y funciona correctamente; eliminado la tarifa que se pasa como parámetro id.

## Que NO se ha entregado
- No he tenido tiempo de hacer un mock del service de monedas para recuperar los formatos de las monedas a través de su codigo ISO.
- No se ha implementado el servicio de conseguir una tarifa por Id ya que requeria el servicio mockeado para el formato de monedas.
- No se ha implementado el servicio de búsqueda personalizada ya que requería el servicio mockeado para el formato de monedas.
- No se han implementado test automáticos.
- No se ha implementado un control de errores en condiciones; utiliza el que hay por defecto en OpenAPI.
- No se ha podido documentar con comentarios las funciones y los métodos de Java.

## Instalación
1. Clona el repositorio:
   ```bash
   git clone https://github.com/Elerionfly/cave-spring-boot.git
   ```
2. Navega al directorio donde se ha descargado:
   ```bash
   cd directorio/donde/se/haya/hecho/el/checkout
   ```
3. Instala las dependencias:
   ```bash
   mvn clean install -U
   ```
4. Arranca el servidor (dependiente del entorno de trabajo donde se este desplegando).
5. Accede a http://localhost:8080/swagger-ui/index.html para comenzar a probar.

## Recomendaciones para la prueba técnica
- Ofrecer un proyecto "en blanco" para la prueba técnica para no tener que perder el tiempo creando un entorno de trabajo (instalar BBDD, preparado IDE, recoger versiones de trabajo y sus depedencias...).
- No sé si el uso de Postgres es necesário por parte del cliente o simplemente porque se ha decidido así; pero tal vez sería más práctico utilizar h2 liquibase para la prueba técnica. Incluso si se hace un proyecto "en blanco" se puede dejar el .xml para h2 con los datos ya cargados; así se valoría realmente el conocimiento sobre Springboot y no sobre BBDD.
- Especificar que versiones de Java/Springboot se requiere para la prueba técnica.
- Se podría añadir una segunda tabla, la de productos o la de marcas, con una FK asociandola a la de tarifas y así obligar a crear alguna relacion @OneToMany o @ManyToMany para la prueba.

## License
Ninguna, os lo regalo todo.






