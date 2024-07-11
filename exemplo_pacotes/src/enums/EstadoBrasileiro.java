package enums;

//Enuns onde os objetos tem propriedades (nome e sigla) e método
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA","Maranhão");
	
	private String sigla;
	private String nome;
	
	//construtor tem que ser privado, pois não há instancia
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	
	// métodos para os atributos
	public String getSigla() {
		return this.sigla;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String nomeMaiusculo() {
		return this.nome.toUpperCase();
	}
}
