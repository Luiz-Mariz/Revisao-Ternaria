
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        String resposta = (idade >= 18 && idade <=60)
                ? "Adulto"
                : idade > 60
                ? "Idoso"
                : "Jovem";

        System.out.println(resposta);
    }
}
