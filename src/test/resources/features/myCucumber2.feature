@SmokeTest

Feature: Login
  Scenario Outline: Como usuario quiero ingresar un email y password para iniciar sesión
    Given que tengo acceso a instagram
    When ingreso mi email: <email>
    And ingreso mi password: "<password>"
    Then hago clic en el botón iniciar sesión
    And muestra la página principal

    Examples:
      | email | password |
      | usuario1@gmail.com | 1111 |
      | usuario2@gmail.com | 2222 |
      | usuario3@gmail.com | 3333 |
