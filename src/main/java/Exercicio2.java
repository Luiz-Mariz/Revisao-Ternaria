
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();

        String resposta = (idade >= 18 ) ? "Maior de idade" : "Menor de idade";
        System.out.println(resposta);
    }

}
