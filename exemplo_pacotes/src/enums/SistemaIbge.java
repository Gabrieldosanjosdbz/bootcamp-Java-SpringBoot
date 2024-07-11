package enums;

public class SistemaIbge {
	public static void main(String[] args) {
		//instanciando os enuns. Não precisa do new
		diaSemana dia = diaSemana.sabado;
		diaSemana dia2 = diaSemana.SEXTA;
		
		//Escolhemos o objeto do nosso enun como se estivessemos acessando uma propriedade
		EstadoBrasileiro saoPaulo = EstadoBrasileiro.SAO_PAULO;
		
		System.out.println("O estado selecionado foi: " + saoPaulo.getNome() + ". que tem a sigla: " + saoPaulo.getSigla() + ". que tem maisuculo fica: " + saoPaulo.nomeMaiusculo());
		System.out.println("No dia: " + dia + " que em maiusculo fica: " + dia.nomeMaiusculo() + ". e o dia anterior foi: " + dia2 + " que em minusculo fica: " + dia2.nomeMinusculo());	
		System.out.println(saoPaulo);
		
		System.out.println("\n\nTodos os estado brasileiros são: ");		
		//Fazendo a listagem dos objetos dentro de um enun
		for(EstadoBrasileiro e : EstadoBrasileiro.values()) {
			System.out.println("A sigla do estado é: " + e.getNome() + " e seu nome é: " + e.nomeMaiusculo());
		}
		
		
		System.out.println("\n\nE todos os dias da semana são: ");
		for(diaSemana d : diaSemana.values()) {
			System.out.println("O dia é: " + d + " e seu nome minusculo fica: " + d.nomeMinusculo());
		}
		
	}
}
