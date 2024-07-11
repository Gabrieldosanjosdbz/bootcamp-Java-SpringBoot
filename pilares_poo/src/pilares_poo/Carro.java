// Herança
package pilares_poo;

public class Carro extends Veiculo{
	
	@Override
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO!");
	}
	
	//encapsulamento
	private void confereCombustivel() {
		System.out.println("CONFERINDO COMBUSTIVEL");
	}
	
	private void confereCambio() {
		System.out.println("CONFERINDO CAMBIO EM P");
	}
}
