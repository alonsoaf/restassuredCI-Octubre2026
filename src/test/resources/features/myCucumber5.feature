Feature: Login

    Scenario: Como usuario quiero ingresar un email y password para iniciar sesión
      Given que tengo acceso a instagram
      When ingreso mi email: alonsoaguilarfi@gmail.com
      And ingreso mi password: "h3c7orhector"
      Then hago clic en el botón iniciar sesión
      And muestra la página principal
      And debería ver los siguientes menus
      | Configuracion |
      | Publicaciones |
      | Ajustes       |
      | Perfil        |
      | Contactos     |

