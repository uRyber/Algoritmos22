/*Escreva um programa que solicite ao usuário um número inteiro e exiba a tabuada desse número de 1 a 10. 
O programa deve permitir ao usuário calcular a tabuada de quantos números ele quiser antes de terminar.
 */
package PALista2;
import java.util.Scanner;

public class L2Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int number = 1;
            int result = 0;
            int i = 0;
                while (number != 0) {
                    System.out.println("Digite um número inteiro positivo e mostrarei a Tabuada dele de 1 à 10,\nOu digite '0' para sair: ");
                    number = ler.nextInt();
                    if (number != 0) {
                        for (i = 1; i <= 10; i++) {
                            result = i * number;
                            System.out.println(number + " X " + i + " = " + result);
                        }    
                    }
                }
        ler.close();
    }
}
