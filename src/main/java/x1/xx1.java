/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x1;

/**
 *
 * @author danie
 */

import java.util.Scanner;
public class xx1 {
    
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        int a, b, arm;
        System.out.println("Insira o valor de A: ");
        a = input.nextInt();
        System.out.println("Insira o valor de B: ");
        b = input.nextInt();
        System.out.println("\n\nValor inicial de B:"+b+" , Valor inicial de A:"+a);
        arm = b;
        b=a;
        a = arm;
        System.out.println("\n\nValor final de B:"+b+" , Valor final de A:"+a);
        
        
    }
    
}
    

    

