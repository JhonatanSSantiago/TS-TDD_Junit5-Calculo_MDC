package com.jhssantiago.mdc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.jhssantiago.mdc.MathUtil.mdc;

/**
 *
 * @author jhons
 */
public class MathUtilTest {

    /* Testes da Propriedade 1
        Se B > 0 é um divisor de A, então MDC(A,B) = B.
    */
    @Test
    void testMdcAParP1() {       
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcAImparP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    /* Testes da Propriedade 2
        Todo número que for divisor comum de A e B também é um divisor de MDC(A,B);
    */
    @Test
    void testeMdcParesP2() {
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int obtido = MathUtil.mdc(a, b);
        assertTrue(obtido % divisor == 0);
    } 
    
    /* Testes da Propriedade 3
       Considerando que todos os números são fatores de 0 (pois 0=0*A para qualquer A inteiro) então MDC(A, 0) = |a|;
    */
    @Test
    void testeMdcAPositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcANegativoP3() {
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    /* Testes da Propriedade 4
        Se M é um inteiro não negativo então MDC(M*A, M*B) = M*MDC(A,B);
    */
    
    @Test
    void testMdcMParP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        //mdc(a*m, b*m) == m * mdc(a, b)
        //mdc(18, 6) == 2 * mdc (9, 3)
        //      6   == 2 * 3
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);        
    }
    
    @Test
    void testMdcMImparP4(){
        final int a = 9;
        final int b = 3;
        final int m = 3;
        //mdc(a*m, b*m) == m * mdc(a, b)
        //mdc(27, 9) == 3 * mdc (9, 3)
        //      9   == 3 * 3
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);        
    }
    
    /* Testes da Propriedade 5
        Se MDC(A, B) = 1 então MDC(A*B, C) = MDC(A,C) * MDC(B, C);
    */
    
     @Test
    void testMdcP5(){
       final int a = 7;
       final int b = 3;
       final int c = 5;
       final int esperado = mdc(a*b, c);
       final int obtido = mdc(b, c);
       assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5Resultado1(){      
       final int b = 3;
       final int c = 5;
       final int esperado = 1;
       final int obtido = mdc(b, c);
       assertEquals(esperado, obtido);
    }
    
    /* Testes da Propriedade 6
        MDC(A, B) = MDC(B, A);
    */
    
    @Test
    void testMdcP6(){
        final int a = 8;
        final int b = 2;      
        final int esperado = mdc(a, b);
        final int obtido = mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP6Negativo(){
        final int a = -8;
        final int b = -2;      
        final int esperado = mdc(a, b);
        final int obtido = mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    /* Testes da Propriedade 7
        MDC(-A, B) = MDC(A, -B) = MDC(-A, -B) = mdc (A, B)
    */
    
    @Test
    void testMdcP7TudoNegativo(){
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP7ANegativo(){
        final int a = -12;
        final int b = 6;
        final int esperado = 6;
        final int obtido = mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testeMdcGeralIndivisiveis(){
        final int a = 30;
        final int b = 12;
        final int esperado = 6;
        final int obtido = mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testeMdcMultiplosValores(){
        final int a = 30;
        final int b = 12;
        final int c = 4;
        final int esperado = 2;
        final int obtido = mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNenhumParametro(){
        assertThrows(IllegalArgumentException.class, () -> mdc());
    }
    
    @Test
    void MdcNulo(){
        assertThrows(NullPointerException.class, () -> mdc(null));
    }
}
