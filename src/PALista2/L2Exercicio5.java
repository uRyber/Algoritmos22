/*Desenvolva um programa que apresente um menu com as opções de adição, subtração, multiplicação, divisão e sair. O usuário deve escolher uma opção e 
fornecer dois números para realizar a operação escolhida. O programa deve repetir o menu até que a opção "sair" seja escolhida. */
package PALista2;
import java.util.Scanner;

public class L2Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int number1 = 0;
            int number2 = 0;
            int result = 0;
            int calculator = 0;

                do {
                    System.out.println("Escolha uma operação que deseja fazer e digite o número correspondente:\n1 - ADIÇÃO\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO\n\n0 - SAIR");
                    calculator = scanner.nextInt();
                    
                    switch (calculator) {
                        case 0:
                            System.out.println("Ok, saindo da Calculadora...");
                                break;
                        case 1:
                            System.out.println("Digite o 1° número:");
                            number1 = scanner.nextInt();
                            System.out.println("Digite o 2° número:");
                            number2 = scanner.nextInt();
                                result = number1 + number2;
                                System.out.println("O " + number1 + " + " + number2 + " é igual à:" + result);
                                    break;
                        case 2:
                            System.out.println("Digite o 1° número:");
                            number1 = scanner.nextInt();
                            System.out.println("Digite o 2° número:");
                            number2 = scanner.nextInt();            
                                result = number1 - number2;
                                System.out.println("O " + number1 + " - " + number2 + " é igual à:" + result);
                                    break;
                        case 3:
                            System.out.println("Digite o 1° número:");
                            number1 = scanner.nextInt();
                            System.out.println("Digite o 2° número:");
                            number2 = scanner.nextInt();    
                                result = number1 * number2;
                                System.out.println("O " + number1 + " * " + number2 + " é igual à:" + result);
                                    break;
                        case 4:
                            System.out.println("Digite o 1° número:");
                            number1 = scanner.nextInt();
                            System.out.println("Digite o 2° número:");
                            number2 = scanner.nextInt();    
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