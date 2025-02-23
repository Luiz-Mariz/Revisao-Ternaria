
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira as notas: ");
        double nota = sc.nextDouble();

        String resposta = (nota >= 7) ? "Aprovado" : "Reprovado";
    }
}
