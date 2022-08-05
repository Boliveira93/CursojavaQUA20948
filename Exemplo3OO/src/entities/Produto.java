package entities;

public class Produto {

	private String nomeProduto;
	private int quantidade;
	private double valor;

	public Produto() {

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

	public String GetNomeProduto() {
		return nomeProduto;
	}
	
	public void SetNomeProduto(String nomeProduto) {
		if(nomeProduto.length() > 3) {
			this.nomeProduto = nomeProduto; 
		}else {
			this.nomeProduto = "PADRÃO";
		}
		
	}
	
	
	
	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public int getQuantidade() {
		return quantidade;
	}



	@Override
	public String toString() {

		return "Nome Produto: " + nomeProduto + "\nQuantidade: " + quantidade + "\nValor Unitario: " + valor
				+ "\nValor total em estoque: " + String.format("%.2f", ValorTotalEmEstoque());
	}

}
