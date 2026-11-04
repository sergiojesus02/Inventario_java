import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest{
    @Test
    void calcularSubtotalDeCuatroProductos() {
        int resultado = Inventario.calcularSubtotal(50, 4);
        assertEquals(250, resultado); // Falla poruqe el resultado espera 200 no 250
    }
}