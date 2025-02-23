
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = sc.nextDouble();

        String resposta = (numero > 10 && numero < 50) ? "Dentro do intervalo" : "Fora do intervalo";
        System.out.println(resposta);
    }
}
