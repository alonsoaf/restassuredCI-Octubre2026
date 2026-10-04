package basicJUnit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BasicJUnit {

    @BeforeEach
    void inicializar() {
        System.out.println("Este método se ejecuta antes de cada test...");
    }

    @AfterEach
    void limpiar() {
        System.out.println("Este método se ejecuta después de cada test...");
    }

    @Order(1)
    @Test
    void crearProyecto() {
        System.out.println("Este es un test que verifica la creación de un proyecto.");
    }

    @Order(2)
    @Test
    void actualizarProyecto() {
        System.out.println("Este es un test que verifica la actualización de un proyecto.");
    }

}
