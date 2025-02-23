
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = sc.nextDouble();

        String resposta =  ((numero % 2 == 0) && (numero > 0)) ? "Sim" : "Não";
        System.out.println(resposta);
    }
}
