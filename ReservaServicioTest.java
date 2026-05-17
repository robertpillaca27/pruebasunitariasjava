import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaServicioTest {

    @Test
    void tiempoValido() {
        assertTrue(ReservaServicio.validarTiempoRespuesta(5000));
    }

    @Test
    void tiempoExcedido() {
        assertFalse(ReservaServicio.validarTiempoRespuesta(5001));
    }

    @Test
    void apiCorrecta() {
        assertTrue(ReservaServicio.procesarRespuesta(true));
    }

    @Test
    void apiFalla() {
        assertFalse(ReservaServicio.procesarRespuesta(false));
    }
}