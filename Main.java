package atividade;

import atividade.Estoque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Estoque estoque = new Estoque();
		
		System.out.println(" produto a ser adicionado ");
		
		System.out.print(" nome :");
		
		estoque.name=sc.nextLine();
		
		System.out.print(" preço :");
		
		estoque.preco = sc.nextDouble();
		
		System.out.print("quantidade em estoque: ");
		
		estoque.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.print("estoque data: " + estoque);
		
		System.out.println();
		System.out.print("informe quantos produtos ira adicionar ");
		
		int quantidade=sc.nextInt();
		estoque.addProduto(quantidade);
		
		System.out.println();
		System.out.print("estes sao os dados atualizados "+ estoque);

	}	

}
