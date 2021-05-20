package com.jhssantiago.mdc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jhons
 */
public class MathUtilTest {

    @Test
    void testMdcAParP1() {
    /* Propriedade 1 - Se B > 0 é um divisor de A, então MDC(A,B) = B. */
        final int a = 6;
        final int b = 3;
        final int esperado = b;       
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAImparP1() {
        /* Propriedade 1 - Se B > 0 é um divisor de A, então MDC(A,B) = B. */
        final int a = 9;
        final int b = 3;
        final int esperado = b;       
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
}
