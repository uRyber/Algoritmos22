/*Escreva um programa que receba três números inteiros do usuário e os exiba em ordem crescente. Use estruturas condicionais para comparar e ordenar os números.*/
package PALista1;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n = 0;

        System.out.println("Digite o primeiro número:");
            n1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
            n2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
            n3 = scanner.nextInt();

            if (n1 > n2) {
                n = n1;
                n1 = n2;
                n2 = n;            
            }
            if (n2 > n3) {
                n = n2;
                n2 = n3;
                n3 = n;
            }
            if (n1 > n2) {
                n = n1;
                n1 = n2;
                n2 = n;
            }

                System.out.println("1° número: "+ n1 + "\n2° número: " + n2 + "\n3° número: " + n3);
        scanner.close();
    }
}
