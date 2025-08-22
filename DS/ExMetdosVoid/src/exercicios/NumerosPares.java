package exercicios;
public class NumerosPares {
    public static void exibirParesDecrescentes() {
        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        exibirParesDecrescentes();
    }
}
