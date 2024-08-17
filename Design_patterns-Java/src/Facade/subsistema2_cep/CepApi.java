package Facade.subsistema2_cep;

public class CepApi {
	private static CepApi instancia = new CepApi();
	
	private CepApi() {}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Grajau";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
