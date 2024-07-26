package Functional_Interface.exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações
        // Com lambda:
        List<String> listaSaudacoes = Stream.generate(saudacao) //o generate recebe um supplier como argumento
                .limit(5)
                .collect(Collectors.toList()); //este método transforma em uma lista

        /* Sem lambda (mais complicado):
            * List<String> listaSaudacoes = Stream.generate(new Supplier(){
            * System.out.println("Olá, seja bem-vindo(a)!")
            * }).limit(5)
            * .collect(Collectors).toList());
        */

        // Imprimir as saudações geradas
        // Esta forma de method reference utiliza uma função já passando como argumentos seus elementos (neste caso o forEach)
        listaSaudacoes.forEach(System.out::println);
    }
}
