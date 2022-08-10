package entities;

public class Carros {
	
	private int ano;
	private String modelo;
	private String cor;
	private String tipo;
	private String cambio;
	private String carroNovoOuUsado;
	private double valor;
	
	
	
	
	
	public String getCarroNovoOuUsado() {
		return carroNovoOuUsado;
	}
	public void setCarroNovoOuUsado(String carroNovoOuUsado) {
		this.carroNovoOuUsado = carroNovoOuUsado;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "\nAno do Carro: " + ano + "\nModelo do Carro: " + modelo +
				"\nCor do Carro: " + cor + "\nTipo do Carro: " + tipo + 
				"\ncambio do Carro " + cambio + "\nCarro novo ou usado: " 
				+ carroNovoOuUsado + "\nvalor do Carro " + valor;
	}

}
