package Facade.subsistema1_crm;

public class CrmService {
	
	private CrmService(){};
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM: " );
		System.out.println("nome: " + nome);
		System.out.println("cep: " + cep);
		System.out.println("cidade: " + cidade);
		System.out.println("estado: " + estado);
	}
}
