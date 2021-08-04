package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.vertx.http.runtime.devmode.Json;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testGetHelloEndpoint() {
        given()
          .when()
          .get("/saludo")
          .then()
          .statusCode(200);
    }
    @Test
    public void testPostHelloEndpoint() {
        given()
                .header("Content-Type","application/json")
                .body("{\"name\": \"Desarrollo\", \"descripcion\": \"Hola Desarrollo\"}")
                .when()
                .post("/saludo")
                .then()
                .statusCode(200);
    }
    @Test
    public void testDeleteHelloEndpoint() {
        given()
                .header("Content-Type","application/json")
                .body("{\"name\": \"Desarrollo\", \"descripcion\": \"Hola Desarrollo\"}")
                .when()
                .delete("/saludo")
                .then()
                .statusCode(200);
    }

}