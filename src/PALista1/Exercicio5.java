/*Escreva um programa que converta uma nota numérica (0 a 100) fornecida pelo usuário em um conceito de letra (A, B, C, D ou F) usando estruturas condicionais.*/
package PALista1;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;

        do {
            System.out.println("Digite uma nota ou '-1' para sair:");
            nota = scanner.nextInt();

            if (nota >= 84) {
                System.out.println("A");
            } else if (nota >= 68) {
                System.out.println("B");
            } else if (nota >= 52) {
                System.out.println("C");
            } else if (nota >= 36) {
                System.out.println("D");
            } else if (nota >= 20) {
                System.out.println("E");
            } else if (nota < 20) {
                System.out.println("F");
            } else {
                System.out.println("Nota inválida!");
            }
        } while (nota != -1);
        scanner.close();
    }
}
