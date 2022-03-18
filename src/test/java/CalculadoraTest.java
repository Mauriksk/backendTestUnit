import calculadora.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Testing sumar: 1+1=2")
    public void suma() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;

        // Act
        Long result = calculadora.suma(number1, number2);

        // Assert
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Testing resta: 1-1=0")
    public void restar() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;

        // Act
        Long result = calculadora.resta(number1, number2);

        // Assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Testing dividir: 10/2=5")
    public void dividir() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 2L;

        // Act
        Long result = calculadora.divicion(number1, number2);

        // Assert
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Testing multiplicar: 10*2=20")
    public void multiplicar() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 2L;

        // Act
        Long result = calculadora.multiplicacion(number1, number2);

        // Assert
        assertEquals(20, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, calculadora.suma(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
