package LPSEM13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadePratica5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            int cont = 0;
            ArrayList<Integer> numeros = new ArrayList<>();

            for (cont = 1; cont <= 10; cont++) {
                System.out.println("Digite o " + cont + "° número: ");
                numeros.add(ler.nextInt());
                ler.close();
            }
            System.out.println("Maior número: " + Collections.max(numeros));
            System.out.println("Menor número: " + Collections.min(numeros));
    }
}