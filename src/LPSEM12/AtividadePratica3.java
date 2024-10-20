package LPSEM12;
import java.util.Scanner;

public class AtividadePratica3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            String sexo;
            
            System.out.println("Digite o caracter: \nM - Masculino | F - Feminino");
            sexo = ler.nextLine();

            if (sexo.equals("M") == true ) {
                System.out.println("Masculino");
            } else if (sexo.equals("F") == true ){
                System.out.println("Feminino");
            } else {
                System.out.println("Não existe");
            }
           
        ler.close();
    }
}
