package pilares_poo2.apps;

//a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {	

	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//apenas as classes filhas conhecem esse método
	protected void validarInternet() {
		System.out.println("Validando se está conectado a internet");
	}
}