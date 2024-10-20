/*Crie um programa que calcule o Índice de Massa Corporal (IMC) com base no peso (em kg) e altura (em metros) fornecidos pelo usuário. O IMC é calculado como peso / (altura * altura). 
Exiba uma mensagem indicando a faixa de IMC (baixo peso, peso normal, sobrepeso, obesidade). */
package PALista1;
import java.util.Scanner;

public class Exercicio4 {
    public static int imc(double peso, double alt){
        double result = 0;
        result = peso / (alt * alt);
    
            if (result < 18.5) {
                return 1;    
            } else if (result >= 18.5 && result < 24.9) {
                return 2;
            } else if (result >= 25 && result < 29.9) {
                return 3;
            } else if (result >= 30 && result < 34.9) {
                return 4;
            } else {
                return 0;
            } 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = 0;
        double alt = 0;

        System.out.println("Digite seu peso em Kg:");
        peso = scanner.nextDouble();
        System.out.println("Digite sua altura em metros:");
        alt = scanner.nextDouble();

        switch (imc(peso, alt)) {
            case 1:
                System.out.println("BAIXO PESO");    
                    break;
            case 2:
                System.out.println("PESO NORMAL");    
                    break;
            case 3:
                System.out.println("SOBREPESO");
                    break;
            case 4:
                System.out.println("OBESIDADE");
                    break;
            default:
                System.out.println("Valor de IMC inválido.");
                    break;
        }
        scanner.close();
    }
}
