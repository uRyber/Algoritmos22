/*Faça um programa que receba dois números inteiros que definem um intervalo e exiba todos os números pares e ímpares dentro desse intervalo. 
Use estruturas condicionais para determinar se um número é par ou ímpar. */
package PALista1;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n1 = 0;
            int n2 = 0;

            System.out.println("Digite o primeiro número (menor):");
                n1 = scanner.nextInt();
            System.out.println("Digite o segundo número (maior):");
                n2 = scanner.nextInt();

            for (int idc = n1; idc <= n2; idc++) {
                if (idc % 2 == 0) {
                    System.out.println("O número: "+ idc +" é par");
                } else {
                    System.out.println("O número: "+ idc +" é impar");
                }
            }     
        scanner.close();    
    }
}
