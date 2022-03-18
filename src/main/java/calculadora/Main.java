package calculadora;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger( Main.class );

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "Ingrese el primer numero =>  " );
        String textNumber1 = bufferedReader.readLine();

        System.out.println( "Ingrese el segundo numero " );
        String textNumber2 = bufferedReader.readLine();

        Long num1 = Long.valueOf( textNumber1 );
        Long num2 = Long.valueOf( textNumber2 );

        Calculadora calculadora = new Calculadora();
        Long resultadoSuma = calculadora.suma( num1, num2 );
        Long resultadoResta = calculadora.resta( num1, num2 );
        Long resultadoDivicion = calculadora.divicion( num1, num2 );
        Long resultadoMultiplicacion = calculadora.multiplicacion( num1, num2 );

        System.out.println("Resultado suma" + num1 + " + " + num2 + " = " + resultadoSuma );
        System.out.println("Resultado resta " + num1 + " + " + num2 + " = " + resultadoResta );
        System.out.println("Resultado divicion " + num1 + " + " + num2 + " = " + resultadoDivicion );
        System.out.println("Resultado multiplicacion " + num1 + " + " + num2 + " = " + resultadoMultiplicacion );

    }
}
