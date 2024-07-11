package pilares_poo2.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
		
	}

	@Override
	public void receberMensagem() {
		validarInternet();
		System.out.println("Recebendo mensagem pelo MSN Messenger");
		
	}

}

