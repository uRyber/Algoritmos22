/*Crie um programa que permita ao usuário jogar um simples jogo de "Par ou Ímpar" contra o computador. */
package PALista2;
import java.util.Scanner;

public class L2Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int opcao = 0;
            int num = 0;
            int user = 0;
            int sw = 0;    
                while (true) {
                    int numpc = 1 + (int) (Math.random() * 10);
                        System.out.println(" __________________________________\n |              JOGO              |\n |          Par ou Ímpar          |\n |________________________________|\n |             PLACAR             |\n |   COMPUTADOR: "+sw+" - USUÁRIO: "+user+"   |\n |________________________________|");    
                        System.out.println(" |            0 - Sair            |\n |            1 - Ímpar           |\n |            2 - Par             |\n |________________________________|");
                        opcao = ler.nextInt();
                        if (opcao == 0) {
                            System.out.println("Saindo do jogo...\nObrigado por jogar!");
                            break;
                        }
                        System.out.println(" __________________________________\n |        INSIRA UM NÚMERO        |\n |________________________________|");
                        num = ler.nextInt();  
                            System.out.println("O Computador escolheu o número: " + numpc);
                                if (((num + numpc) % 2) == 0 && opcao == 2 || ((num + numpc) % 2) != 0 && opcao == 1) {
                                    System.out.println(" __________________________________\n |          RESULTADO: "+(num+numpc)+"          |"+"\n |________________________________|");
                                    System.out.println(" __________________________________\n |          VOCÊ VENCEU!          |\n |________________________________|");
                                    user++;                                        
                                } else {
                                    System.out.println(" __________________________________\n |          RESULTADO: "+(num+numpc)+"          |"+"\n |________________________________|");
                                    System.out.println(" __________________________________\n |       COMPUTADOR VENCEU!       |\n |________________________________|");
                                    sw++;  
                                }
                }
        ler.close();
    }
}
