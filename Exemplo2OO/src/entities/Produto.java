package entities;

public class Produto {

	public String nomeProduto;
	public int quantidade;
	public double valor;
	
	/*public Produto() {
		
	}*/
	
	public Produto(String nomeProduto, int quantidade, double valor) {
		// atributo da classe parametro recebido no construtor
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.valor = valor;
		
	}
	
	public Produto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public void AdicionarItem(int qdt) {
		quantidade += qdt;
	}
	
	public void RemoverItem(int qdt) {
		quantidade -= qdt;
	}
	
	public double ValorTotalEmEstoque() {
		return quantidade * valor;
	}

	/*
	 * public void Estoque() { System.out.println("Temos em estoque: " +(valor *
	 * quantidade)); }
	 */

	// UMA FORMA DE ENCURTA O CÓDIGO
	@Override
	public String toString() {

		return "Nome Produto: " + nomeProduto + "\nQuantidade: " + quantidade + "\nValor Unitario: " + valor
				+ "\nValor total em estoque: " + String.format("%.2f", ValorTotalEmEstoque());
	}

}
