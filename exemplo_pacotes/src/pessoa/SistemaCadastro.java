package pessoa;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa gabriel = new Pessoa("06724506716","Gabriel dos Anjos");
		
		Pessoa kay = new Pessoa();
		
		gabriel.setEndereco("Rua irmã maria lourença");
		
		System.out.println("Olá, meu nome é " + gabriel.getNome() + "meu cpf é: " + 
		gabriel.getCpf() + "e eu moro no endereço" + gabriel.getEndereco());
		
	}
}
