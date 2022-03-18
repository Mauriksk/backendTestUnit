package calculadora;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculadora {
    private static final Logger logger = LoggerFactory.getLogger(Calculadora.class);

    public Long suma(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long resta(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 - number2;
    }

    public Long divicion(Long number1, Long number2) {
        if(number2 == 0) throw new RuntimeException("No se puede dividir por cero");
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 / number2;
    }

    public Long multiplicacion(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 * number2;
    }
}
