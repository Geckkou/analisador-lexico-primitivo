import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Entradas proibidas
        ArrayList<String> bloqueado = new ArrayList<String>();
        bloqueado.add("x");
        bloqueado.add("y");
        bloqueado.add("z");
        bloqueado.add("t");
        bloqueado.add("w");

        //Entrada dos dados
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> cadeia = new ArrayList<String>();
        int quantidade = 20000;

        //insere os itens na cadeia
        for(int i = 0; i < quantidade; i++) {
            quantidade = 10;
            System.out.println("informe uma cadeia");
            cadeia.add(i,scanner.nextLine());
        }

        //Verifica se a cadeia é valida
        for(int i = 0; i < quantidade; i++){
           quantidade = 10;
           if (!cadeia.equals(bloqueado)) {
               System.out.println("cadeia não valida");
               break;
           }
        }
        System.out.println(cadeia);

        //imprime
        //System.out.println(cadeia);
        //System.out.println("itens que não podem: " + bloqueado);
    }
}