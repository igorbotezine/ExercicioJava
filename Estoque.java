package atividade;

public class Estoque {

	public String name;
	public double preco;
	public int quantidade;
	
	public double totalValueInStock()
	{
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade)
	{
		this.quantidade += quantidade; 
	}
	
	public void removerProdutos(int quantidade)
	{
		this.quantidade -= quantidade;
	}
	
	public String toString()
	{
		return name + ", $ "+ preco + ", " + quantidade + "unidades, total: $ " + totalValueInStock();
	}
}
