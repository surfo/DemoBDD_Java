# BDD JAVA

BDD o Desarrollo impulsado por comportamiento (Behavor Driven Development), es una práctica de ingeniería de software diseñada para ayudar a los equipos a diseñar y a entregar un software más valioso y de mayor calidad con gran rapidez.  Se basa principalmente en prácticas agiles que incluye el desarrollo basado en pruebas (TDD) y el diseño impulsado por dominio (DDD). BDD proporciona un lenguaje basado en oraciones estructuradas de una forma simple (Gherkin), que facilitan la comunicación entre los miembros del equipo. 


Especificaciones Ejecutable
Cucumber + Rest Assured

Especificaciones Tecnicas
Junit5 + Rest Assured

## Backend Java Quarkus (getting-started) con un Index Html 

#### 1. Requisitos

IDE (IntelliJ)

JDK 11+ instalado con JAVA_HOME configurado

Apache Maven 3.8.1+

2. Creaciòn del proyecto inicial Quarkus


- Para usuarios de Linux y MacOS
```console
mvn io.quarkus:quarkus-maven-plugin:2.1.0.Final:create \
    -DprojectGroupId=org.acme \
    -DprojectArtifactId=getting-started \
    -DclassName="org.acme.getting.started.GreetingResource" \
    -Dpath="/hello"
cd getting-started
```

- Windows

```console
mvn io.quarkus:quarkus-maven-plugin:2.1.0.Final:create "-DprojectGroupId=org.acme" "-DprojectArtifactId=getting-started" "-DclassName=org.acme.getting.started.GreetingResource" "-Dpath=/hello"
```

#### Genera lo siguiente en ./getting-started:

- estructura de Maven

- org.acme.getting.started.GreetingResourcerecurso expuesto en/hello

- una prueba unitaria asociada

- una página de destino a la que se puede acceder http://localhost:8080 después  de iniciar la aplicación

- Dockerfile de ejemplo

- archivo de configuración de la aplicación

[Fuente Quarkus](https://quarkus.io/guides/getting-started)

Otra opciòn clonarlo...


Quarkus Start API
```console
surfo@surfo:~/Practicas/Desarrollo/quarkus/Demo BDD/getting-started$ ./mvnw compile quarkus:dev:
```


## Especificaciòn Ejecutable con Cucumber y Rest Assured (EE)



```console
surfo@surfo:~/Practicas/Desarrollo/quarkus/Demo BDD/EE/hellocucumber$ mvn test
```
[Fuente Cucumber](https://cucumber.io/docs/guides/10-minute-tutorial/)