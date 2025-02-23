
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = sc.nextDouble();
        double somaNumero = 0;

        for (int i = 0; i < numero; i++){
            if (numero % i == 0){
                somaNumero += i;
            }
        }

        String reposta = (numero == somaNumero) ? "Número perfeito" : "Número não perfeito";
        System.out.println(reposta);
    }
}
