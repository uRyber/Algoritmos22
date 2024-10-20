package LPSEM13;
import java.util.Scanner;

public class AtividadePratica2 {

    public static boolean verificarPar (int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int numero;

            System.out.println("Digite um número: ");
            numero = ler.nextInt();

            if (verificarPar(numero)) {
                System.out.println("O número: " + numero + " é par!");
            } else {
                System.out.println("O número: " + numero + " é impar!");
            }  
        ler.close();  
    }
}