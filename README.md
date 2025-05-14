## Descripción

Genera un proyecto Spring Boot en https://start.spring.io/

Ábrelo con tu IDE. Modifica el archivo application.properties y configura la variable server.port con valor 9000.

Crear dos métodos, greet1 y greet2. 

El primer método responderá a una petición GET e irá configurado para recibir el parámetro como un `RequestParam`. El parámetro "name" tendrá el valor por defecto "UNKNOWN".

Deberá responder a:

    http://localhost:9000/HelloWorld
    http://localhost:9000/HelloWorld?name=My+name

El segundo método responderá a una petición GET e irá configurado para recibir el parámetro como una `PathVariable`. El parámetro "name" será opcional.

Deberá responder a:

    http://localhost:9000/HelloWorld2
    http://localhost:9000/HelloWorld2/myname

***

<br>


### Tecnologias usadas

- Java 21

- Maven

- Spring Boot


***


## Cómo ejecutarlo
Clona el repositorio o descarga el archivo zip, luego ábrelo en tu entorno de desarrollo integrado (IDE) preferido.
