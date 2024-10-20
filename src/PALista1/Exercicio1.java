/*Crie um programa que receba um número inteiro do usuário e utilize estruturas condicionais para verificar se o número é positivo, negativo ou zero. 
Exiba uma mensagem correspondente. */
package PALista1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int number = 0;

            System.out.println("Digite um número e direi se é positivo, negativo ou zero:");
            number = scanner.nextInt();

                if (number > 0) {
                    System.out.println("O número " + number + " é positivo!");
                } else if (number == 0) {
                    System.out.println("O número " + number + " é igual à zero!");
                } else {
                    System.out.println("O número " + number + " é negativo!");
                }
            scanner.close();
    }
    
}