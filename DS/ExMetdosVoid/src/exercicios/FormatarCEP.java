package exercicios;
import java.util.Scanner;

public class FormatarCEP {
    public static void formatarCEP() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CEP: EX(12345678)");
        String cep = sc.nextLine();

        String parte1 = cep.substring(0, 5);
        String parte2 = cep.substring(5,8);
        
        String cepFormatado = parte1 + "-" + parte2;

        sc.close();
        System.out.println("CEP formatado: " + cepFormatado);
    }

    public static void main(String[] args) {
        formatarCEP();
    }
}
