package exercicios;
import java.util.Scanner;
public class VerificadorIdade {
	public static void verificarIdade() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		if(idade > 17) {
			System.out.println("Você é maior de idade");
		}else {
				System.out.println("Você é menor de idade");
			}
		sc.close();
		}
	public static void main(String[] args) {
		verificarIdade();
	}
		
}

