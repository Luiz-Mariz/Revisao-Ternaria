
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o  valor da compra: ");
        double compra = sc.nextDouble();

        String resposta = (compra >= 100) ? "Frete gratis" : "Frete pago";
        System.out.println(resposta);
    }
}
