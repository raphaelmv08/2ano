package exercicios;
import java.util.Scanner;

public class ValidadorNome {
    public static void validarNome(String nome) {
        if (nome.length() < 3) {
            System.out.println("Nome inválido O nome deve ter pelo menos 3 caracteres.");
        } else {
            System.out.println("Nome válido: " + nome);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); 
        
        validarNome(nome); // Chama o método para validar o nome

        sc.close();
    }
}
