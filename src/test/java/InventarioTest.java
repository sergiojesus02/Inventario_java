import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest{
    @Test
    void calcularSubtotalDeCuatroProductos() {
        int resultado = Inventario.calcularSubtotal(50, 4);
        assertEquals(250, resultado); // Se cambio el numero de 200 a 250 es un error porque espera un 200 no 250
    }
}