
package teste;

import com.manoel.metowebproject.CalculadoraBean;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Manoel Frank
 */

public class SomaValidator {

    //Forçando um erro    
    @Test
    public void testarSoma(){
        CalculadoraBean cb = new CalculadoraBean();
       double valor1 = 10;
       double valor2 = 10;
       double retornoEsperado = 20;
       
       double retornoRealizado = cb.somar();
       assertEquals(retornoEsperado, retornoRealizado, 20);
    }
}
