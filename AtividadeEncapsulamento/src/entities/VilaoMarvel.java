package entities;

public class VilaoMarvel {
	
	private String idSecreta;
	private String nomeHeroi;
	private String planetaNatal;
	private String liga;
	private String cidadeNatal;
	private String baseSecreta;
	private String poder;
	private int idade;
	private String estaAtivo;
	
	public VilaoMarvel(String idSecreta, String nomeHeroi, String planetaNatal, String liga, String cidadeNatal ) {
		this.idSecreta = idSecreta;
		this.nomeHeroi = nomeHeroi;
		this.planetaNatal = planetaNatal;
		this.liga = liga;
		this.cidadeNatal = cidadeNatal;
	}
	
	public VilaoMarvel(String idSecreta, String nomeHeroi, String planetaNatal, String liga, String cidadeNatal, String baseSecreta, String superPoder, int idade, String estaAtivo) {
		this(idSecreta, nomeHeroi, planetaNatal, liga, cidadeNatal);
		this.baseSecreta = baseSecreta;
		this.poder = superPoder;
		this.idade = idade;
		this.estaAtivo = estaAtivo;
	}
	
	public void imprime() {
		System.out.println(this.idSecreta);
		System.out.println(this.nomeHeroi);
		System.out.println(this.planetaNatal);
		System.out.println(this.liga);
		System.out.println(this.cidadeNatal);
		System.out.println(this.baseSecreta);
		System.out.println(this.poder);
		System.out.println(this.idade);
		System.out.println(this.estaAtivo);
	}
	
	public VilaoMarvel() {
		
	}

	public String getIdSecreta() {
		return idSecreta;
	}

	public void setIdSecreta(String idSecreta) {
		this.idSecreta = idSecreta;
	}

	public String getNomeHeroi() {
		return nomeHeroi;
	}

	public void setNomeHeroi(String nomeHeroi) {
		this.nomeHeroi = nomeHeroi;
	}

	public String getPlanetaNatal() {
		return planetaNatal;
	}

	public void setPlanetaNatal(String planetaNatal) {
		this.planetaNatal = planetaNatal;
	}

	public String getLiga() {
		return liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

	public String getCidadeNatal() {
		return cidadeNatal;
	}

	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}

	public String getBaseSecreta() {
		return baseSecreta;
	}

	public void setBaseSecreta(String baseSecreta) {
		this.baseSecreta = baseSecreta;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEstaAtivo() {
		return estaAtivo;
	}

	public void setEstaAtivo(String estaAtivo) {
		this.estaAtivo = estaAtivo;
	}
	
	@Override 
	public String toString() {
		
		return "Nome Secreto: " + idSecreta + "\nNome do Heroi: " + nomeHeroi + 
				"\nPlaneta Natal: " + planetaNatal + "\nPertence a Liga: " + liga + "\nCidade Natal: " + cidadeNatal + 
				"\nBase Secreta: " + baseSecreta + "\nSuper Poder: " + poder + "\nIdade: " + idade +
				"\nEsta em Atividade: " + estaAtivo;
	}

}
