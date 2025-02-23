
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Insira o segundo número: ");
        double numero2 = sc.nextDouble();

        double resposta = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("Maior numero: " + resposta);
    }
}
