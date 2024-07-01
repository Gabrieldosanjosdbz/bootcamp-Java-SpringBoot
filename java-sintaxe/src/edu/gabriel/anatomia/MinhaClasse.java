package edu.gabriel.anatomia;

public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Gabriel";
        String segundoNome = "dos Anjos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        // o método concat (concatenar) serve para juntar variaveis
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
