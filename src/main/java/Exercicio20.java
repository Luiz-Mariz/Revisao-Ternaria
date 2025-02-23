
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a nota: ");
        double nota = sc.nextDouble();

        String reposta = (nota >= 7)
                ? "Aprovado"
                :(nota >= 5)
                ? "Recuperação"
                : "Reprovado";

        System.out.println(reposta);
    }
}
