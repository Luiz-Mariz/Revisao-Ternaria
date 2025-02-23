
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = sc.nextDouble();

        String reposta = ((numero % 2 == 0) || (numero % 3 == 0)) ? "Divisivel" : "Não divisivel";
        System.out.println(reposta);
    }
}
