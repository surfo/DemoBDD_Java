package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//ResAssured
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import static org.junit.Assert.*;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

//Selenium
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    private Response response;
    private String responseBody;
    private ValidatableResponse json;
    private String responseString;


    @Given("Inicio {string}")
    public void inicio(String string)
    {
        RestAssured.baseURI = string;
        given()
                .then()
                .statusCode(200);
        System.out.println("Inicio {string} " + RestAssured.baseURI );

       /* System.setProperty("webdriver.chrome.driver", "/home/surfo/Practicas/Automatizacion/Webdriver/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get(RestAssured.baseURI);
        WebElement href = browser.findElement(By.xpath("/html/body/div[2]/div[1]/div/p[2]/code/a"));
        assertTrue((href.isDisplayed()));
        browser.close(); */
    }
    @When("ingreso al step {string}")
    public void ingreso_al_step(String string)
    {
        RestAssured.basePath = string;
        Response response =  when()
                .get(RestAssured.baseURI + RestAssured.basePath)
                .then()
                .statusCode(200)
                //.log().all()
                .extract()
                .response();
     responseBody = response.getBody().asString();
        System.out.println("ingreso al step {string} " + RestAssured.baseURI + RestAssured.basePath);
        System.out.println("ingreso al step {string} Response " + responseBody);

    }
    @Then("el sistema me muestra {string}")
    public void el_sistema_me_muestra(String string)
    {
       //System.out.println(responseBody.contains(string));
       assertEquals(responseBody.contains(string) /*Se espera el valor*/, true /*Actual Valor*/);
       //assertEquals(string, responseString);
    }
}
