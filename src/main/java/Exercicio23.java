
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Crie uma senha com minimo 8 caracteres: ");
        String senha = sc.next();

        String reposta = (senha.length() >= 8) ? "Senha valida" : "Senha não possui no minimo 8 caracteres";
        System.out.println(reposta);
    }
}

