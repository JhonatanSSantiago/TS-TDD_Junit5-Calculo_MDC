package com.jhssantiago.mdc;

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
        
        if(a % b != 0){ //P5
            return 1;
        }
        return -1;
    }
}
