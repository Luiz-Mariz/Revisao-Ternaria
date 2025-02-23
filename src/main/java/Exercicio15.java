
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = sc.nextDouble();

        String resposta = (numero % 3 == 0 && numero % 5 == 0) ? "FizzBuzz" : String.valueOf(numero);
        System.out.println(resposta);
    }
}
