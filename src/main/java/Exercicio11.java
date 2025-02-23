
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String vogal = "aeiouAEIOU";
        System.out.print("Informe um caracter: ");
        String caracter = sc.next();

        String resposta = (vogal.contains(caracter)) ? "Vogal" : "Consoante";
        System.out.println(resposta);
    }
}
