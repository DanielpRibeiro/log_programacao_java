/*
 * Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
 * valores de modo que a variável A passe a possuir o valor da variável B, e a
 * variável B passe a possuir o valor da variável A. Apresentar os valores
 * trocados.
 */

package x1;

/*
 *
 *
 * @author daniel
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
        System.out.println("\n\nValor inicial de A:"+a+" , Valor inicial de B:"+b);
        arm = b;
        b=a;
        a = arm;
        System.out.println("\n\nValor final de A:"+a+" , Valor final de B:"+b);
        
        
    }
    
}
    

    

