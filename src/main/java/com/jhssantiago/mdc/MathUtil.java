package com.jhssantiago.mdc;

import java.util.Objects;

/**
 *
 * @author jhons
 */
public class MathUtil {
    public static int mdc(int a, int b){
        a = Math.abs(a); //P7
        b = Math.abs(b);
        
        
        final int maior = Math.max(a, b); //P6
        b = Math.min(a, b);
        a = maior;
        
       
        if(b > 0 && a % b == 0){ // P1         
           return b;
        }
        
        if(b == 0 ){ //P3
            return Math.abs(a);
        }
        
        return mdc(a - b, b);
    }
    
    public static int mdc(int ...valores){
        Objects.requireNonNull(valores, "O valor não pode ser nulo");
        if(valores.length == 0){
            throw new IllegalArgumentException("Indique pelo menos 1 número para calcular o mdc");
        }
        
        int a = valores[0];
        for (int b : valores) {
            a = mdc(a, b);
        }
            return a;
    }
}
