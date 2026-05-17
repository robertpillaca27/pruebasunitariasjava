import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FormularioServicioTest {

    @Test
    void campoVacio() {
        assertFalse(FormularioServicio.validarFormulario(""));
    }

    @Test
    void campoValido() {
        assertTrue(FormularioServicio.validarFormulario("Robert"));
    }

    @Test
    void maximoPermitido() {
        assertTrue(FormularioServicio.validarFormulario("a".repeat(50)));
    }

    @Test
    void excedeLimite() {
        assertFalse(FormularioServicio.validarFormulario("a".repeat(51)));
    }
}