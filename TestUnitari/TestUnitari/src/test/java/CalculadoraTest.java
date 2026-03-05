import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class CalculadoraTest {
    
    private Calculadora calc;


    @BeforeEach  //Aisla los tests y evita repetir codigo
    public void setUp() {
        calc = new Calculadora();
    }

    @Test  //Verifica que la operación  de suma sea correcta
    public void testSuma() {
        assertEquals(5, calc.suma(2, 3));
    }

    @Test  //Comprueba se reste correctamente.
    public void testResta() {
        assertEquals(1, calc.resta(4, 3));
    }

    @Test //Asegura que el producto de dos números sea el correcto
    public void testMultiplicacio() {
        assertEquals(20, calc.multiplicacio(4, 5));
    }

    @Test  //Verifica que el programa colapse cuando alguien intenta dividir por zero.
    public void testDivisioPerZero() {
        // Esta es la forma correcta en JUnit 5
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divisio(10, 0);
        });
    }
    @Test
@DisplayName("Verifica que 10 dividit per 2 és 5")
public void testDivisioStandard() {
    assertEquals(5, calc.divisio(10, 2), "La divisió de 10/2 hauria de ser 5");
}
 @Test
@DisplayName("Verifica que la suma de dos negatius funciona")
public void testSumaNegatius() {

    assertEquals(-15, calc.suma(-5, -10), "La suma de -5 i -10 hauria de ser -15");
}   
    
}