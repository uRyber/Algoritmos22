/*Desenvolva um programa que apresente um menu de opções para o usuário escolher entre calcular a área de um círculo, retângulo ou triângulo. Dependendo da escolha, 
o programa deve solicitar os valores necessários e calcular a área correspondente.
 */
package PALista1;
import java.util.Scanner;
public class Exercicio6 {

    public static String circulo(Scanner scanner) {
            double raio = 0;
            double result = 0;

            System.out.println("Digite o raio do círculo:");
            raio = scanner.nextDouble();

            result = (raio*raio) * 3.14;
        return "\nA área do círculo é: " + result;
    }

    public static String retangulo(Scanner scanner) {
            double base = 0;
            double alt = 0;
            double result = 0;

            System.out.println("Digite quantos cm tem a base do retângulo:");
            base = scanner.nextDouble();
            System.out.println("Digite quantos cm tem a altura do retângulo:");
            alt = scanner.nextDouble();

            result = (base*alt);
        return "\nA área do retângulo é: " + result;
    }

    public static String triangulo(Scanner scanner) {
            double base = 0;
            double alt = 0;
            double result = 0;

            System.out.println("Digite quantos cm tem a base do triângulo:");
            base = scanner.nextDouble();
            System.out.println("Digite quantos cm tem a altura do triângulo:");
            alt = scanner.nextDouble();

            result = ((base * alt) / 2);
        return "\nA área do retângulo é: " + result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int option = 0;

                do {
                    System.out.println("ESCOLHA UMA DAS OPÇÕES:\n1 - Calcular a área de um círculo\n2 - Calcular a área de um retângulo\n3 - Calcular a área de um triângulo\n0 - Sair");
                    option = scanner.nextInt();

                    switch (option) {
                        case 0:
                            break;
                        case 1:
                            System.out.println(circulo(scanner));
                                break;
                        case 2:
                            System.out.println(retangulo(scanner));
                                break;
                        case 3:
                            System.out.println(triangulo(scanner));
                                break;
                        default:
                            System.out.println("OPÇÃO INEXISTENTE");
                            break;
                    }
                } while (option != 0);

        scanner.close();
    }
}