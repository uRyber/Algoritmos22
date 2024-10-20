/*Crie um programa que solicite ao usuário que insira números inteiros positivos. O programa deve somar esses números até que o usuário insira um número negativo,
momento em que o programa deve exibir a soma total e terminar.*/
package PALista2;
import java.util.Scanner;
public class L2Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n1 = 0;
            int soma = 0;

            do {
                System.out.println("Digite um número positivos, caso deseje ver a soma de todos insira um número negativo: ");
                n1 = scanner.nextInt();

                    if (n1 > 0) {
                        soma = soma + n1;
                    }
            } while (n1 > 0);

                System.out.println("TOTAL: " + soma);
        scanner.close();
    }
}