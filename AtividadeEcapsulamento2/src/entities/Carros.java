package entities;

public class Carros {
	
	private int ano;
	private String modelo;
	private String cor;
	private String tipo;
	private char tipoCombustivel;
	private char cambio;
	private String carroNovoOuUsado;
	private double valor;
	private Clientes cliente;
	
	
	public String getCarroNovoOuUsado() {
		return carroNovoOuUsado;
	}
	public void setCarroNovoOuUsado(String carroNovoOuUsado) {
		this.carroNovoOuUsado = carroNovoOuUsado;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) throws Exception {
		if(ano >= 2019) {
			this.ano = ano;
		}else {
			throw new Exception("Não pode ser Efetuado cadastro, carro com o ano imcopativel só aceitamos carros com menos de 3 nos de uso");
		}
		
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
	public char getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(char tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public char getCambio() {
		return cambio;
	}
	public void setCambio(char cambio) {
		this.cambio = cambio;
	}
	public double getValor() {
		return valor;
	}
	/*public void setValor(double valor) {
		this.valor = valor;
	}*/
	
	public void ValorCompra(double valor) {
		this.valor += (valor + (valor * 0.40));
	}
	
	
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return  "\nAno do Carro: " + ano + "\nModelo do Carro: " + modelo +
				"\nCor do Carro: " + cor + "\nTipo do Carro: " + tipoCombustivel + 
				"\ncambio do Carro " + cambio + "\nCarro novo ou usado: " 
				+ carroNovoOuUsado + "\nvalor do Carro " + valor;
	}

}
