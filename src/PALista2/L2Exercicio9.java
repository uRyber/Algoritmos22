/*Implemente um jogo de Pedra, Papel e Tesoura onde o usuário joga contra o computador. O jogo deve continuar até que o usuário escolha sair. 
O programa deve exibir o vencedor de cada rodada e manter um placar. */
package PALista2;
import java.util.Scanner;

public class L2Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int escolha = 0;
            int user = 0;
            int sw = 0;
            String[] options = {"Pedra", "Papel", "Tesoura"};
                while (true) {
                    int option = (int) (Math.random() * 3);
                        System.out.println(" __________________________________\n |              JOGO              |\n |     Pedra, Papel e Tesoura     |\n |________________________________|\n |             PLACAR             |\n |   COMPUTADOR: "+sw+" - USUÁRIO: "+user+"   |\n |________________________________|");
                        System.out.println(" |          0 - PEDRA             |\n |          1 - PAPEL             |\n |          2 - TESOURA           |\n |          3 - SAIR              |\n |________________________________|");
                        escolha = ler.nextInt();
                            if (escolha == 3) {
                                System.out.println("Saindo do jogo...\nObrigado por jogar!");
                                break;
                            }
                            System.out.println("\nComputador escolheu: " + options[option]);
                                    if (escolha == 0 && option == 2 ||escolha == 1 && option == 0 ||escolha == 2 && option == 1) {
                                        System.out.println(" __________________________________\n |          VOCÊ VENCEU!          |\n |________________________________|");
                                        user++;
                                    } else if (escolha == option) {
                                        System.out.println(" __________________________________\n |            EMPATE!             |\n |________________________________|");
                                    } else {
                                        System.out.println(" __________________________________\n |       COMPUTADOR VENCEU!       |\n |________________________________|");
                                        sw++;    
                                    } 
                }
        ler.close();
    }
}
