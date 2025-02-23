
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o ano para saber se é bissexto: ");
        int ano = sc.nextInt();

        String resposta = ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) ? "Ano bissexto" : "O ano não é bissexto";
        System.out.println(resposta);
    }
}
