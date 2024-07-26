package Class_Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Criando Optional com um valor
        Optional<String> nome = Optional.of("Ana");

        // Criando Optional vazio
        Optional<String> nomeVazio = Optional.empty();

        // Verificando se o valor está presente
        if (nome.isPresent()) {
            System.out.println("Nome: " + nome.get());
        } else {
            System.out.println("Nome não está presente");
        }

        // Usando o método orElse para fornecer um valor padrão
        String nomeOuDefault = nomeVazio.orElse("Nome padrão");
        System.out.println("Nome: " + nomeOuDefault);

        // Usando o método ifPresent para executar uma ação se o valor estiver presente
        nome.ifPresent(n -> System.out.println("Nome presente: " + n));
    }
}
