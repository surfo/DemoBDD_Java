Feature: Hola Automatizaciòn

  Scenario: Inicio API Hola Automatizaciòn
    Given Inicio "http://localhost:8080"
    When ingreso al step "/saludo"
    Then el sistema me muestra "Hola Automatizaciòn"

