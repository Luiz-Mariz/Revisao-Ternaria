
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = sc.nextDouble();

        String resultado = ((numero > 0 && numero % 2 == 0))
                ? "Numero par positovo"
                : (numero < 0 && numero % 2 == 0)
                ? "Numero par negativo"
                : (numero > 0 && numero % 2 != 0)
                ? "Numero impar positivo"
                :(numero == 0)
                ? "Zero"
                : "Numero impar negativo";

        System.out.println(resultado);
    }
}
