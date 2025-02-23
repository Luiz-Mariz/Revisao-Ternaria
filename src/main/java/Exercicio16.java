

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.print("Informe true ou false: ");
        boolean escolha = sc.nextBoolean();

        boolean resposta = (escolha == true) ? false : true;
        System.out.println(resposta);
    }
}
