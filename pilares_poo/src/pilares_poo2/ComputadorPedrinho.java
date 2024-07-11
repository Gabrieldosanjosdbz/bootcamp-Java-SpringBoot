package pilares_poo2;
import java.util.Scanner;

import pilares_poo2.apps.FacebookMessenger;
import pilares_poo2.apps.MSNMessenger;
import pilares_poo2.apps.ServicoMensagemInstantanea;
import pilares_poo2.apps.Telegram;

import java.util.Locale;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in).useLocale(Locale.US);
		boolean continuar = true;
		
		// To falando que meu app será do tipo ServicoMensagemInstantanea
		// Porque todas as minhas outras classes que eu pretendo instanciar
		// São do mesmo tipo que ela, ou seja, são filhas da minha classe ServicoMensagemInstantanea
		// Permitindo que eu use lógicas como essa.
		ServicoMensagemInstantanea app = null;
		
		while(continuar) {
			System.out.println("Escolha o programa desejado: fcb = 1; msn = 2; telegram = 3: ");
			String escolha = scn.nextLine();
			
			switch(escolha) {
			case "1":
				app = new FacebookMessenger();
				continuar = false;
				break;
				
			case "2":
				app = new MSNMessenger();
				continuar = false;
				break;
				
			case "3":
				app = new Telegram();
				continuar = false;
				break;
				
			default:
				System.out.println("Tente novamente: \n\n");
				break;
			}
		}
		
		app.enviarMensagem();
		app.receberMensagem();
			
	}
}