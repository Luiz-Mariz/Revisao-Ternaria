
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = sc.nextDouble();

        String resposta = (numero > 0) ? "Positivo" : numero == 0 ? "Zero" : "Negativo";
        System.out.println(resposta);
    }

}
