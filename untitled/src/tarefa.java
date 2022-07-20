import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class tarefa {

    public static void main(String args[]){

        ordemAlfabética();
        separadoGeneros();
    }

    private static void separadoGeneros() {
        System.out.println("Lista 2");
        String nome = "Roberto-M-Claudia-F-Andre-M-Paula-F-Celso-M-Marta-F-Marcel-M-Bruna-F";
      System.out.println(nome);
      System.out.println(" *** Lista Genero: Masculino *** ");
        String[] nomes = nome.split("-");
      System.out.println(nomes[0]+" "+nomes[4]+" "+nomes[8]+" "+nomes[12]);
      System.out.println(" *** Lista Genero: Feminino *** ");
      System.out.println(nomes[2]+" "+nomes[6]+" "+nomes[10]+" "+nomes[14]);
    }

    private static void ordemAlfabética() {

        System.out.println("Lista 1");

        System.out.println("Sem Ordem Alfabética");

        List<String> lista = new ArrayList<String>();
        lista.add("Eusebio");
        lista.add("Mercedes");
        lista.add("Manoel");
        lista.add("Maria");
        lista.add("Patrick");
        lista.add("Barbara");

        System.out.println(lista);

        System.out.println("Ordem Alfabética");
        Collections.sort(lista);
        System.out.println(lista);





    }
    }
