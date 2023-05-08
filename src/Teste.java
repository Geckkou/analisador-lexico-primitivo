import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste {
    public static void main(String[] args) {

        //Declaração da cadeia e leitura
        System.out.println("Informe a cadeia");
        String cadeia  = new String();
        Scanner scanner = new Scanner (System.in);
        cadeia = scanner.nextLine();

        StringBuilder refatorada = new StringBuilder();

        //Limitando a cadeia para 10 caracteres
        for (int i = 0; i < 10; i++) {
            char token = cadeia.charAt(i);
            refatorada.append(token);
        }

        String cadeiaRefatorada = refatorada.toString();

        //Declarando Regex
        //vendo se existe o numero no inicio da cadeia usando regex
        Pattern regex = Pattern.compile("^\\d");
        Matcher matcher = regex.matcher(cadeiaRefatorada);

        //Declarando Regex
        //verifica se os tokens xyztw vem seguidos de acordo com os requisitos da 2 questão
        Pattern regex2 = Pattern.compile("([xyztw])+([+\\-*/])|([xyztw])+([\\(\\)\\[\\]\\{\\}\\@\\#\\!])|([xyztw])+([\\d])");
        Matcher matcher2 = regex2.matcher(cadeiaRefatorada);

        //Verifica se a cadeia é valida
        if (matcher.find()) {
            System.out.println("Palavra reservada");
        }

        if (matcher2.find()) {
            System.out.println("Expressão matemática");
        } else if (cadeiaRefatorada.contains("x") || cadeiaRefatorada.contains("y") || cadeiaRefatorada.contains("z") || cadeiaRefatorada.contains("t") || cadeiaRefatorada.contains("w")) {
            System.out.println("cadeia não valida");
        }

        //System.out.println(cadeia);
        System.out.println(cadeiaRefatorada);
    }
}
