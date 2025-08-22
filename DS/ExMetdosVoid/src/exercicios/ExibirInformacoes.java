package exercicios;
import java.util.Scanner;

public class ExibirInformacoes {
    public static void exibirDados(String nome, int idade, String email, double peso) {
        System.out.println("Nome: " + nome.toUpperCase());
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email.toLowerCase());
        System.out.printf("Peso: %.2f\n", peso);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu e-mail: ");
        sc.nextLine(); 
        String email = sc.nextLine();

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        exibirDados(nome, idade, email, peso);

        sc.close();
    }
}
	
