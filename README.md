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
   git clone https://github.com/your-username/your-repository.git
   ```
2. Navigate to the project directory:
   ```bash
   cd your-repository
   ```
3. Install dependencies:
   ```bash
   npm install
   ```

## Usage
- How to run the project
- Example commands
- Configuration options

## Contributing
- Fork the repository
- Create a new branch
- Submit a pull request

## License
This project is licensed under the MIT License.

# Project Name

## Description
A brief description of what your project does and its purpose.

## Features
- Feature 1
- Feature 2
- Feature 3

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repository.git
   ```
2. Navigate to the project directory:
   ```bash
   cd your-repository
   ```
3. Install dependencies:
   ```bash
   npm install
   ```

## Usage
- How to run the project
- Example commands
- Configuration options

## Example Test
**Run the following command to execute tests:**
   ```bash
   npm test
   ```

## Displaying Properties
To display properties from the `.properties` file, use the following command:
   ```bash
   cat application.properties | grep "^your.property.name"
   ```
Example `.properties` file:
   ```properties
   app.name=MyCoolApp
   app.version=1.0.0
   app.env=production
   ```

## Contributing
- Fork the repository
- Create a new branch
- Submit a pull request

## License
This project is licensed under the MIT License.






