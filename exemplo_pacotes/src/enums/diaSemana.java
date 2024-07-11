package enums;

//Enuns onde os objetos não tem propriedades e tem método
public enum diaSemana {
	SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, sabado;
	
	// Método para retornar o nome do dia da semana em minúsculas
	public String nomeMaiusculo() {
	    return this.name().toUpperCase();
	}
	
	public String nomeMinusculo() {
		return this.name().toLowerCase();
	}
}
