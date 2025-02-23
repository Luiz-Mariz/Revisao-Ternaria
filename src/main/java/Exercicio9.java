
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Insira o segundo número: ");
        double numero2 = sc.nextDouble();

        String resposta = (numero1 > numero2) ? "Maior" : "Menor ou igual";
        System.out.println(resposta);
    }
}
