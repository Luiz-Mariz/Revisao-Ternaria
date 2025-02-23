
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = sc.nextDouble();

        String resposta = (numero % 2 == 0) ? "é um número par" : "é  um número impar";
        System.out.println( numero + " "+resposta);
    }
}
