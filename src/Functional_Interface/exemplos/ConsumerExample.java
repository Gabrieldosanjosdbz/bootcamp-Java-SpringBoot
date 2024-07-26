package Functional_Interface.exemplos;

import java.util.*;
import java.util.function.Consumer;

/*
    * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado
    * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
    * retornar um valor
*/
public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        //o forEach já ativa o método accept do consumer automaticamente já passando os elementos da lista como argumento
        numeros.stream().forEach(imprimirNumeroPar);
    }
}
