package pilares_poo2.apps;

public class Telegram extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		
	}

	@Override
	public void receberMensagem() {
		validarInternet();
		System.out.println("Recebendo mensagem pelo Telegram");
		
	}

}

