package pilares_poo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("897897");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("4667754");
		z400.ligar();
		
		//polimorfismo
		//Veiculo coringa = new Veiculo; isso daqui não pode, pois nao se pode instanciar classe abstrata
		Veiculo coringa = jeep; //porém isso pode
	}
}

