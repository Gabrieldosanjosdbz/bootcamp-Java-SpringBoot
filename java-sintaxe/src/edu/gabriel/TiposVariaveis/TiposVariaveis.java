package edu.gabriel.TiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args){
        //tipos primitivos
        
        String meuNome = "Gabriel dos Anjos";
        char letra = 'a';

        float salarioMinimo = (float) 2500.5;
        double salarioMaximo = 28000.4;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        // Esta é a sintaxe para mudar o tipo de uma variavel numerica para outra, e o nome disso é casting
        short numeroCurto2 = (short) numeroNormal;

        // refatorando o valor de numero
        int numero = 5;
        numero = 10;
        
        //variavel que nunca será mudada 
        final double VALOR_DE_PI = 3.14;

        System.out.println(meuNome + letra + salarioMaximo + salarioMinimo + numeroCurto + numeroCurto2 + VALOR_DE_PI + numero);
    }
}



