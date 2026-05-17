import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EcommerceServicioTest {

    @Test
    void descuentoValido() {
        assertTrue(EcommerceServicio.validarDescuento(50));
    }

    @Test
    void descuentoMinimo() {
        assertTrue(EcommerceServicio.validarDescuento(0));
    }

    @Test
    void descuentoMaximo() {
        assertTrue(EcommerceServicio.validarDescuento(100));
    }

    @Test
    void descuentoInvalido() {
        assertFalse(EcommerceServicio.validarDescuento(101));
    }

    @Test
    void pagoExitoso() {
        assertTrue(EcommerceServicio.procesarPago(true, true));
    }

    @Test
    void tarjetaInvalida() {
        assertFalse(EcommerceServicio.procesarPago(false, true));
    }

    @Test
    void sinFondos() {
        assertFalse(EcommerceServicio.procesarPago(true, false));
    }
}