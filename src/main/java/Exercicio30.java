
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        String resposta = (media >= 6) ? "Aluno aprovado" : "Aluno reprovado";
        System.out.println(resposta);
     }
}
