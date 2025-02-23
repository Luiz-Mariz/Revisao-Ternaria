
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        String resposta = (idade >= 18) ? "Você ja pode dirigir" : "Você não pode dirigir";
        System.out.println(resposta);
    }
}
