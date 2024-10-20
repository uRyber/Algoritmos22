/*Crie um programa que solicite ao usuário que insira uma senha. O programa deve permitir até 3 tentativas de entrada correta. Se a senha correta for inserida, 
exibir uma mensagem de "Acesso Permitido" e terminar. Se após 3 tentativas a senha estiver incorreta, exibir "Acesso Negado" e terminar.
*/
package PALista2;
import java.util.Scanner;
public class L2Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int senha = 0;
            int teste = 0;
            int idc = 0;

                System.out.println("Digite a senha para ser salva: ");
                senha = scanner.nextInt();
                System.out.println("Senha salva!");
           
                            for (idc = 1; idc <= 3; idc++) {
                                System.out.println("Digite a senha: ");
                                teste = scanner.nextInt();
                                    if (teste == senha) {
                                        System.out.println("Acesso Permitido!");
                                        idc = 3;
                                    } else {
                                        System.out.println("Acesso Negado!");
                                    }
                                if (idc == 3) {
                                    scanner.close();    
                                }
                            }
        scanner.close();
    }    
}
