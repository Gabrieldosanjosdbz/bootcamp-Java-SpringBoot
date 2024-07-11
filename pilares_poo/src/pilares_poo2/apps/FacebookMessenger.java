package pilares_poo2.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		
	}

	@Override
	public void receberMensagem() {
		validarInternet();
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
		
	}

}

