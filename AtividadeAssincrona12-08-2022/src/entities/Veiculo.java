package entities;

public class Veiculo {
	
	private String qtdPneusMoto;
	private String qtdPneusCarro;
	private double qtdCavalos;
	private String qtdCilindrada;
	private String qtdPassageiroMoto;
	private String qtdPassageiroCarro;
	private String tipoCombustivel;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String qtdPneusMoto) {
		this.qtdPassageiroMoto = qtdPassageiroMoto;
		this.qtdPneusCarro = qtdPneusCarro;
		this.qtdCavalos = qtdCavalos;
		this.qtdCilindrada = qtdCilindrada;
		this.qtdPassageiroMoto = qtdPassageiroMoto;
	}
	public Veiculo(String qtdPneusMoto,String qtdPneusCarro,double  qtdCavalos,String qtdCilindrada,String qtdPassageiroMoto,String qtdPassageiroCarro,String tipoCombustivel) {
		this();
		this.qtdPassageiroMoto = qtdPassageiroMoto;
		this.qtdPneusCarro = qtdPneusCarro;
		this.qtdCavalos = qtdCavalos;
		this.qtdCilindrada = qtdCilindrada;
		this.qtdPassageiroMoto = qtdPassageiroMoto;
		this.qtdPassageiroCarro = qtdPassageiroCarro;
		this.tipoCombustivel = tipoCombustivel;
		
	}

	public String getQtdPneusMoto() {
		return qtdPneusMoto;
	}

	public void setQtdPneusMoto(String qtdPneusMoto) {
		this.qtdPneusMoto = qtdPneusMoto;
	}

	public String getQtdPneusCarro() {
		return qtdPneusCarro;
	}

	public void setQtdPneusCarro(String qtdPneusCarro) {
		this.qtdPneusCarro = qtdPneusCarro;
	}

	

	public double getQtdCavalos() {
		return qtdCavalos;
	}

	public void setQtdCavalos(double qtdCavalos) {
		this.qtdCavalos = qtdCavalos;
	}

	public String getQtdCilindrada() {
		return qtdCilindrada;
	}

	public void setQtdCilindrada(String qtdCilindrada) {
		this.qtdCilindrada = qtdCilindrada;
	}

	public String getQtdPassageiroMoto() {
		return qtdPassageiroMoto;
	}

	public void setQtdPassageiroMoto(String qtdPassageiroMoto) {
		this.qtdPassageiroMoto = qtdPassageiroMoto;
	}

	public String getQtdPassageiroCarro() {
		return qtdPassageiroCarro;
	}

	public void setQtdPassageiroCarro(String qtdPassageiroCarro) {
		this.qtdPassageiroCarro = qtdPassageiroCarro;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	@Override
	public String toString() {
		
		return "\nQTD de Pneus em uma Moto: " +  qtdPneusMoto + 
				"\nQTD Pneus Carro: " + qtdPneusCarro + 
				"\nQTD de cavalos: " + qtdCavalos + 
				"\nQTD de Cilindradas: " + qtdCilindrada +
				"\nQTD Passageiros na Moto: " + qtdPassageiroMoto +
				"\nQTD Passageiros no Carro: " + qtdPassageiroCarro + 
				"\nTipo de Combustivel: " + tipoCombustivel;
	}
	
	

}
