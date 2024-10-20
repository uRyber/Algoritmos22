/*Desenvolva um programa que funcione como uma calculadora simples. O usuário deve fornecer dois números e uma operação (adição, subtração, multiplicação, divisão) 
e o programa deve exibir o resultado. */
package PALista1;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        int result = 0;
        int calculator = 0;

            do {
                System.out.println("Escolha uma operação que deseja fazer e digite o número correspondente:\n1 - ADIÇÃO\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO\n\n0 - SAIR");
                calculator = scanner.nextInt();

                    System.out.println("Digite o 1° número:");
                    number1 = scanner.nextInt();
                    System.out.println("Digite o 2° número:");
                    number2 = scanner.nextInt();
                
                switch (calculator) {
                    case 1:
                        result = number1 + number2;
                        System.out.println("O " + number1 + " + " + number2 + " é igual à:" + result);
                            break;
                    case 2:
                        result = number1 - number2;
                        System.out.println("O " + number1 + " - " + number2 + " é igual à:" + result);
                            break;
                    case 3:
                        result = number1 * number2;
                        System.out.println("O " + number1 + " * " + number2 + " é igual à:" + result);
                            break;
                    case 4:
                        result = number1 / number2;
                        System.out.println("O " + number1 + " / " + number2 + " é igual à:" + result);
                            break;
                    default:
                        System.out.println("Nenhuma das alternativas");
                        break;
                }
                
            } while (calculator != 0);
        scanner.close();
    }

}
