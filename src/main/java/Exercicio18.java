
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe consecutivamente os lados do seu triangulo: ");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        String reposta = ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado2))
                ? "Triangulo equilatero"
                : (lado1 == lado2 && lado1 != lado3)
                ? "Triangulo isoceles"
                : "Triangulo escaleno";

        System.out.println(reposta);
    }
}
