package steps;

import io.cucumber.java.DataTableType;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class MyStepdefs {

    /**
     *
     * {}       -> reemplaza cualquier valor como parámetro
     * {word}   -> reemplaza una sola palabra
     * {string} -> reemplaza un valor cuando está en comillas dobles
     * {int}    -> reemplaza un valor numérico
     * {float}  -> reemplaza un valor decimal
     */


    @Given("que tengo acceso a {}")
    public void queTengaAccesoAFacebook(String appName) {
        System.out.println("step: que tengo acceso a " +appName);
    }

    @When("ingreso mi email: {word}")
    public void ingresoMiEmailAlonsoaguilarfiGmailCom(String email) {
        System.out.println("step: ingreso mi usuario " + email);
    }

    @And("ingreso mi password: {string}")
    public void ingresoMiPassword(String password) {
        System.out.println("step: ingreso mi clave " + password);
    }

    @Then("hago clic en el botón iniciar sesión")
    public void hagoClicEnElBotónIniciarSesión() {
        System.out.println("step: clic botón iniciar sesión");
    }

    @And("muestra la página principal")
    public void muestraLaPáginaPrincipal() {
        System.out.println("muestra página principal");
    }


    @And("no muestra la página principal")
    public void noMuestraLaPáginaPrincipal() {
        System.out.println("** No muestra la página principal");
    }

    @And("debería ver los siguientes menus")
    public void deberíaVerLosSiguientesMenus(List<String> menus) {
        for(String menu: menus){
            System.out.println("menu: " + menu);
        }
    }

    @When("me registro con")
    public void meRegistroCon(Map<String, String> data) {
        data.forEach((String key, String value) -> {
            System.out.println("clave: " + key + " - valor: " + value);
        });
    }

    /*
    @When("me registro usando")
    public void meRegistroUsando(Persona persona) {
        System.out.println("Persona: ");
        System.out.println("nombre: " + persona.getNombre());
        System.out.println("apellidos: " + persona.getApellidos());
        System.out.println("telefono: " + persona.getTelefono());
        System.out.println("direccion: " + persona.getDireccion());
        System.out.println("dni: " + persona.getDni());
    }

    */

    @When("me registro usando")
    public void meRegistroUsando(List<Persona> personas) {
        for(Persona persona : personas) {
            System.out.println("Persona: ");
            System.out.println("nombre: " + persona.getNombre());
            System.out.println("apellidos: " + persona.getApellidos());
            System.out.println("telefono: " + persona.getTelefono());
            System.out.println("direccion: " + persona.getDireccion());
            System.out.println("dni: " + persona.getDni());
            System.out.println("----");
        }
    }


    @DataTableType
    public Persona convertToPersona(Map<String, String> data){
        Persona persona = new Persona();
        persona.setNombre(data.get("nombre"));
        persona.setApellidos(data.get("apellidos"));
        persona.setTelefono(data.get("telefono"));
        persona.setDireccion(data.get("direccion"));
        persona.setDni(data.get("dni"));
        return persona;
    }

    @Then("debería ver sus terminos de aceptacion")
    public void deberíaVerSusTerminosDeAceptacion(String data) {
        System.out.println("términos de aceptación: \n" + data);
    }
}
