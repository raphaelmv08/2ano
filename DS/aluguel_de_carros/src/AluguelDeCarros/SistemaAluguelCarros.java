package AluguelDeCarros;

import java.util.Scanner;

public class SistemaAluguelCarros {
    private Carro[] carros;
    private Cliente[] clientes;
    private Scanner ler;

    public SistemaAluguelCarros() {
        ler = new Scanner(System.in);

        carros = new Carro[] {
            new Carro("ABC1234", "Fiat Uno", true),
            new Carro("XYZ5678", "Ford Ka", true),
            new Carro("DEF9012", "Volkswagen Gol", true),
            new Carro("R57H69F", "Parati Turbo", true)
        };

        clientes = new Cliente[] {
            new Cliente("João Silva", "123.456.789-00"),
            new Cliente("Maria Souza", "987.654.321-00"),
            new Cliente("Vinicius Menezes", "313.476.291-40")
        };
    }

    public void mostrarClientes() {
        System.out.println("\nClientes cadastrados:");
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(i + " - " + clientes[i].getNome());
        }
    }

    public void mostrarCarrosDisponiveis() {
        System.out.println("\nCarros disponíveis:");
        boolean temDisponivel = false;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].getDisponivel()) {
                System.out.println(i + " - " + carros[i].getModelo() + " (" + carros[i].getPlaca() + ")");
                temDisponivel = true;
            }
        }
        if (!temDisponivel) {
            System.out.println("Nenhum carro disponível no momento.");
        }
    }

    public void alugarCarro() {
        mostrarClientes();
        System.out.print("Escolha o cliente pelo número: ");
        int numCliente = ler.nextInt();
        ler.nextLine();
        if (numCliente < 0 || numCliente >= clientes.length) {
            System.out.println("Cliente inválido.");
            return;
        }

        System.out.println("Carros disponíveis para aluguel:");
        int[] disponiveis = new int[carros.length];
        int cont = 0;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].getDisponivel()) {
                System.out.println(cont + " - " + carros[i].getModelo() + " (" + carros[i].getPlaca() + ")");
                disponiveis[cont] = i;
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Nenhum carro disponível para aluguel.");
            return;
        }

        System.out.print("Escolha o carro pelo número: ");
        int numCarro = ler.nextInt();
        ler.nextLine();
        if (numCarro < 0 || numCarro >= cont) {
            System.out.println("Carro inválido.");
            return;
        }

        carros[disponiveis[numCarro]].setDisponivel(false);
        System.out.println("Carro " + carros[disponiveis[numCarro]].getModelo() + " alugado para " + clientes[numCliente].getNome() + ".");
    }

    public void devolverCarro() {
        System.out.println("Carros alugados:");
        int[] alugados = new int[carros.length];
        int cont = 0;
        for (int i = 0; i < carros.length; i++) {
            if (!carros[i].getDisponivel()) {
                System.out.println(cont + " - " + carros[i].getModelo() + " (" + carros[i].getPlaca() + ")");
                alugados[cont] = i;
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Nenhum carro alugado para devolver.");
            return;
        }

        System.out.print("Escolha o carro pelo número para devolver: ");
        int num = ler.nextInt();
        ler.nextLine();
        if (num < 0 || num >= cont) {
            System.out.println("Número inválido.");
            return;
        }

        carros[alugados[num]].setDisponivel(true);
        System.out.println("Carro " + carros[alugados[num]].getModelo() + " devolvido com sucesso.");
    }

    public void menu() {
        int op;
        do {
            System.out.println("\n--- Sistema de Aluguel de Carros ---");
            System.out.println("1 - Listar clientes");
            System.out.println("2 - Listar carros disponíveis");
            System.out.println("3 - Alugar carro");
            System.out.println("4 - Devolver carro");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op = ler.nextInt();
            ler.nextLine();

            switch (op) {
                case 1: mostrarClientes();
                break;
                case 2: mostrarCarrosDisponiveis(); 
                break;
                case 3: alugarCarro(); 
                break;
                case 4: devolverCarro(); 
                break;
                case 0: System.out.println("Saindo...");
                break;
                default:
                	System.out.println("Opção inválida."); 
                	break;
            }
        } while (op != 0);
    }

    public static void main(String[] args) {
        SistemaAluguelCarros sistema = new SistemaAluguelCarros();
        sistema.menu();
    }
}
