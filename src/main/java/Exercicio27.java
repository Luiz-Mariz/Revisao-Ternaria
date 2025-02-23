
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = sc.nextDouble();

        String resposta = (numero >= 0) ? "Positivo ou Zero" :  "Negativo";
        System.out.println(resposta);
    }
}
