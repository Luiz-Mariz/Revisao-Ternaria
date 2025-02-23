
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = sc.nextDouble();

        String resposta = (numero > 20 && numero < 30) ? "Dentro do intervalo" : "Fora do intervalo";
        System.out.println(resposta);
    }
}
