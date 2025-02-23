
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Informe se você e estudadete (S/N): ");
        char estudade = sc.next().charAt(0);

        String respota = (idade >= 60 || estudade == 'S') ? "Qualificada desconto" : "Desqualificada desconto";
        System.out.println(respota);
    }
}