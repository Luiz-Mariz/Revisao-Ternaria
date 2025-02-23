
import java.util.Scanner;

public class  Exercicio25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ome de um dia da semana: ");
        String dia = sc.next();

        String resposta = (dia.equals("Domingo") || dia.equals("Sabado")) ? "Final semana" : "Dia util";
        System.out.println(resposta);
    }
}
