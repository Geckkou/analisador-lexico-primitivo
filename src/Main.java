import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //Declaração da cadeia e leitura
        System.out.print("Informe a cadeia: ");
        String cadeia;
        Scanner scanner = new Scanner (System.in);
        cadeia = scanner.nextLine();

        //Limitando a cadeia para 10 caracteres
        StringBuilder refatorada = new StringBuilder();

        for (int i = 0; i < cadeia.length(); i++) {
            if (cadeia.length() >= 10){
                String token = cadeia.substring(0,10);
                refatorada = new StringBuilder(token);
            } else {
                refatorada = new StringBuilder(cadeia);
            }
        }

        String cadeiaRefatorada = refatorada.toString();

        //Declarando Regex
        //vendo se existe o numero no inicio da cadeia usando regex
        Pattern regex = Pattern.compile("^\\d");
        Matcher matcher = regex.matcher(cadeiaRefatorada);

        //Declarando Regex
        //verifica se os tokens xyztw vem seguidos de acordo com os requisitos da 2 questão
        Pattern regex2 = Pattern.compile("([xyztw])+([+\\-*/])|([\\d])+([+\\-*/])");
        Matcher matcher2 = regex2.matcher(cadeiaRefatorada);

        //Declarando Regex
        //verifica se os tokens xyztw estão na cadeia
        Pattern regex3 = Pattern.compile("[(xyztw)]");
        Matcher matcher3 = regex3.matcher(cadeiaRefatorada);

        //Verifica se a cadeia é valida
        if (matcher.find()) {
            System.out.println("Palavra reservada");
        }

        if (matcher2.find()) {
            System.out.println("Expressão matemática");
        } else if (matcher3.find()) {
            System.out.println("cadeia não valida");
        }

        //Imprimindo a cadeia
        System.out.println("");
        System.out.print("Sua cadeia é: " + cadeiaRefatorada);
        scanner.close();
    }
}
