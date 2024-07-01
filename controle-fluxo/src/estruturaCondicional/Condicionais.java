package estruturaCondicional;

public class Condicionais {
    public static void main(String[] args) {

        // condicional simples (if)
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

        // ***************************************

        // condicional composta (if e else)
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");

        // ******************************************

        // condicional encadeada (if, else if e else)
        int nota2 = 6;

        if (nota2 >= 7)
            System.out.println("Aprovado");
        else if (nota2 >= 5 && nota2 < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
        
        // *********************************************

        // condição ternária
		int nota3 = 7;
		String resultado = nota3 >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        // *************************************************

        // SWITCH CASE
		String sigla = "M";

        // se lê: "switch: se sigla; case: for."
        // Break serve para parar a execução 
        // default é um valor padrão caso nenhum case sirva 
		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
    }
}