package LPSEM13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadePratica3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            ArrayList<Integer> listaNumeros = new ArrayList<>();
            int cont = 0;

            for (cont = 1; cont <= 5; cont ++) {
                System.out.println("Digite o " + cont + "° número: ");
                listaNumeros.add(ler.nextInt());
                ler.close();
            }

            System.out.println(listaNumeros);
            
            Collections.sort(listaNumeros);
                System.out.println("Crescente: ");
                System.out.println(listaNumeros);

            Collections.reverse(listaNumeros);
                System.out.println("Decrescente: ");
                System.out.println(listaNumeros);

    }
}