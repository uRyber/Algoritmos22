package LPSEM13;
import java.util.Scanner;

public class AtividadePratica1 {

public static String saudacao(String nome) {
    return "Olá, " + nome + "! Bem-vindo(a)!";
}
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String namePerson;
        
        System.out.println("Digite seu nome: ");
        namePerson = ler.nextLine();

        System.out.println(saudacao(namePerson));
        ler.close();   
    }
}