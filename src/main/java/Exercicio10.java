
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = sc.nextDouble();

        String resposta = (numero > 100) ? "Alto" : "Baixo";
        System.out.println(resposta);
    }
}
