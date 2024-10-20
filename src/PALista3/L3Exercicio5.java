/*Crie um método chamado somarListas que receba duas listas de inteiros de mesmo tamanho e retorne uma nova lista contendo a soma dos elementos correspondentes das duas listas. 
Exemplo: se as listas forem [1, 2, 3] e [4, 5, 6], o método deve retornar [5, 7, 9].*/
package PALista3;
import java.util.List;
import java.util.ArrayList;
public class L3Exercicio5 {

    public static List<Integer> somarListas(List<Integer> lista1, List<Integer> lista2){
        List<Integer> listaSoma = new ArrayList<>();
        
        if (lista1.size() != lista2.size()) {
            throw new IllegalArgumentException("As listas devem ter o mesmo tamanho.");
        }

            for (int i = 0; i < lista1.size(); i++){
                listaSoma.add(lista1.get(i) + lista2.get(i));
            }

    return listaSoma;
    }

    public static void main(String[] args) {
            List<Integer> Lista1 = new ArrayList<>();
            Lista1.add(1);
            Lista1.add(2);
            Lista1.add(3);
                
            List<Integer> Lista2 = new ArrayList<>();
            Lista2.add(4);
            Lista2.add(5);
            Lista2.add(6);

                System.out.println(somarListas(Lista1, Lista2));
    }
}