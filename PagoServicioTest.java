import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagoServicioTest {

    @Test
    void montoValido() {
        assertTrue(PagoServicio.validarMonto(100));
    }

    @Test
    void montoMenorMinimo() {
        assertFalse(PagoServicio.validarMonto(9));
    }

    @Test
    void montoMaximo() {
        assertTrue(PagoServicio.validarMonto(5000));
    }

    @Test
    void montoExcedido() {
        assertFalse(PagoServicio.validarMonto(5001));
    }

    @Test
    void impuestoCorrecto() {
        assertEquals(18, PagoServicio.calcularImpuesto(100));
    }

    @Test
    void montoInvalidoImpuesto() {
        assertThrows(IllegalArgumentException.class, () -> {
            PagoServicio.calcularImpuesto(-50);
        });
    }
}