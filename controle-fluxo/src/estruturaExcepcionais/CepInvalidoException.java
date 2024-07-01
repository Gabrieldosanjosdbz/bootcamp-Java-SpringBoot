package estruturaExcepcionais;

public class CepInvalidoException extends Exception{

    // usamos o construtor do Exception para mostrar a mensagem
    public CepInvalidoException(){
        // Chama o construtor da superclasse Exception, passando como argumento a mensagem "CEP Invalido idiota".
        super("CEP Invalido idiota");
    }
}
