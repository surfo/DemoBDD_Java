Feature: Hola Automatizaciòn POST

  Scenario: Inicio API Hola Automatizaciòn
    Given Inicio "http://localhost:8080"
    When ingreso al step "/saludo" body "{holas}" method POST
    Then el sistema add "holas"