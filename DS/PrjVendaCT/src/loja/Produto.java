package loja;

import java.util.Scanner;

public class Produto {
	//Atributos - caracteristicas da classe
	
	public String nomeProduto;
	public Double valor;
	public String numeroLote;
	public int idProduto;

	public void cadastrar () {
		//codigo do cadastro
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ID");
		idProduto = sc.nextInt();
		
		System.out.println("Digite o valor do produto");
		valor = sc.nextDouble();
		
		System.out.println("Digite o nome do produto");
		nomeProduto = sc.next();
			
		System.out.println("Digite o numero do lote");
		numeroLote = sc.next();
	}
	
	public void exibir () {
		//codigo do cadastro
		System.out.println( "ID do produto: " +idProduto+
							"\nValor do produto: "+valor+
							"\nNome do produto: "+nomeProduto+
							"\nNumero do lote do produto: "+numeroLote);
	}
}
