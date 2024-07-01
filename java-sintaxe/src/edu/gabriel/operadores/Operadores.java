package edu.gabriel.operadores;

public class Operadores {
    public static void main(String[] args) {
        // classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // *********************************************
        
        int numero = 5;

        // deixando um numero negativo
        numero = - numero;
        System.out.println(numero);

        // deixando o numero positivo
        numero *= -1; // isso é a abreviacao de numero = numero * -1
        System.out.println(numero);

        // **********************************************

        int a, b;
        a = 1;
        b = 2;

        String resultado = a==b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        int resultado2 = a==b ? 1 : 0;

        System.out.println(resultado2);

        // **********************************************

        String nomeUm = "Gabriel";
        String nomeDois = new String("Gabriel");

        // Compara o tipo e o resultado
        System.out.println(nomeUm == nomeDois);
        // Compara o resultado
        System.out.println(nomeUm.equals(nomeDois));
    }
}