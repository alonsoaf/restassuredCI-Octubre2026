Feature: Login

  Scenario: Como usuario quiero ingresar un email y password para registrar usuarios
    Given que tengo acceso a instagram
    When me registro usando
      | nombre | apellidos | telefono | direccion | dni |
      | carlos | perez  | 123         | peru | 23232 |
    Then muestra la página principal