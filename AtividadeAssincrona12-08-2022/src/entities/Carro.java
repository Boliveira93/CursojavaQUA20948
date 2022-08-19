package entities;

public class Carro extends Veiculo {
	
	private String arCondicionado;
	private String sonorizacao;

	public Carro() {

	}

	

	public Carro(int qtdPneus, String motor, int qtdPassageiros, String tipoCombustivel, String tipo, String modelo, String arCondicionado, String sonorizacao) {
		super(qtdPneus, motor, qtdPassageiros, tipoCombustivel, tipo, modelo);
		
		this.arCondicionado = arCondicionado;
		this.sonorizacao = sonorizacao;
	}



	public String getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(String arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public String getSonorizacao() {
		return sonorizacao;
	}

	public void setSonorizacao(String sonorizacao) {
		this.sonorizacao = sonorizacao;
	}



	@Override
	public String toString() {
		return super.toString() + "arCondicionado=" + arCondicionado 
				+ "\nSonorizacao=" + sonorizacao ;
	}
	
	

}
