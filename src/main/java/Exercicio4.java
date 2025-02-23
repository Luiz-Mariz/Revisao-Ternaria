
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = sc.nextDouble();

        String resposta = (numero % 5 == 0) ? "Multiplo de 5" : "Não é multiplo de 5";
    }
}
