
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        String reposta = (idade >=16) ? "Você pode votar" : "Você não pode votar";
        System.out.println(reposta);

    }
}
